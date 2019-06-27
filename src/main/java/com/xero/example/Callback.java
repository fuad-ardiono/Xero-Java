package com.xero.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.MemoryDataStoreFactory;
import com.xero.api.ApiClient;
import com.xero.api.client.IdentityApi;
import com.xero.models.identity.Connection;

/**
 * Servlet implementation class Callback
 */
@WebServlet("/Callback")
public class Callback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Callback() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = "123";
		if (request.getParameter("code") != null) {   
			code = request.getParameter("code");
		}
		final String clientId = "CEC496D0B24D4448A8F1D8B6A3F5C00E";
        final String clientSecret = "RyndE0-u_Drvu-jIwBNO4Hcsug-kCcQQgUQOB4AHTHpHl2z9";
        final String redirectURI = "http://localhost:8080/xero-sdk-oauth2-dev-01/Callback";
        
        ArrayList<String> scopeList = new ArrayList<String>();
        scopeList.add("openid");
        scopeList.add("email");
        scopeList.add("profile");
        scopeList.add("offline_access");
        scopeList.add("accounting.settings");
        scopeList.add("accounting.transactions");
        scopeList.add("accounting.contacts");
        scopeList.add("accounting.journals.read");
        scopeList.add("accounting.reports.read");
        scopeList.add("accounting.attachments");
        scopeList.add("paymentservices");
        
        final NetHttpTransport HTTP_TRANSPORT = new NetHttpTransport();
        final JsonFactory JSON_FACTORY = new JacksonFactory();
        final String TOKEN_SERVER_URL = "https://identity.xero.com/connect/token";
        final String AUTHORIZATION_SERVER_URL = "https://login.xero.com/identity/connect/authorize";
        DataStoreFactory DATA_STORE_FACTORY = new MemoryDataStoreFactory();		
        
        AuthorizationCodeFlow flow = new AuthorizationCodeFlow.Builder(BearerToken.authorizationHeaderAccessMethod(), 
        		HTTP_TRANSPORT, 
        		JSON_FACTORY, 
        		new GenericUrl(TOKEN_SERVER_URL), 
        		new ClientParametersAuthentication(clientId, clientSecret), clientId, AUTHORIZATION_SERVER_URL).setScopes(scopeList).setDataStoreFactory(DATA_STORE_FACTORY).build();
       TokenResponse accessToken = flow.newTokenRequest(code).setRedirectUri(redirectURI).execute();
       
       HttpTransport httpTransport = new NetHttpTransport();
	   JsonFactory jsonFactory = new JacksonFactory();
	   GoogleCredential credential = new GoogleCredential.Builder().setTransport(httpTransport).setJsonFactory(jsonFactory).setClientSecrets(clientId, clientSecret).build();
	   credential.setAccessToken(accessToken.getAccessToken());
	   credential.setRefreshToken(accessToken.getRefreshToken());
	   credential.setExpiresInSeconds(accessToken.getExpiresInSeconds());
	 
      
       // Create requestFactory with credentials
       HttpTransport transport = new NetHttpTransport();        
       HttpRequestFactory requestFactory = transport.createRequestFactory(credential);

       // Init IdentityApi client
       ApiClient defaultClient = new ApiClient(null,null,null,null,requestFactory);
       IdentityApi idApi = new IdentityApi(defaultClient);
       List<Connection> connection = idApi.getConnections();

       TokenStorage store = new TokenStorage();
       store.saveItem(response, "access_token", accessToken.getAccessToken());
       store.saveItem(response, "refresh_token", accessToken.getRefreshToken());
       store.saveItem(response, "expires_in_seconds", accessToken.getExpiresInSeconds().toString());
       store.saveItem(response, "xero_tenant_id", connection.get(0).getTenantId().toString());

       response.sendRedirect("./AuthenticatedResource");
	}
}