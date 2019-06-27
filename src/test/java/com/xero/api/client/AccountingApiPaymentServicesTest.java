package com.xero.api.client;

import static org.junit.Assert.assertTrue;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

import com.xero.api.ApiClient;
import com.xero.api.client.*;
import com.xero.models.accounting.*;

import java.io.File;
import java.net.URL;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

import org.threeten.bp.*;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import java.util.Calendar;
import java.util.Map;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class AccountingApiPaymentServicesTest {

	ApiClient defaultClient; 
    AccountingApi accountingApi; 
     
    
    private static boolean setUpIsDone = false;
	
	@Before
	public void setUp() {
		// Set Access Token from Storage
        String accessToken = "123";
        Credential credential =  new Credential(BearerToken.authorizationHeaderAccessMethod()).setAccessToken(accessToken);
        
        // Create requestFactory with credentials
        HttpTransport transport = new NetHttpTransport();        
        HttpRequestFactory requestFactory = transport.createRequestFactory(credential);

        // Init AccountingApi client
        defaultClient = new ApiClient("https://virtserver.swaggerhub.com/Xero/accounting/2.0.0",null,null,null,requestFactory);
        accountingApi = new AccountingApi(defaultClient);
       
        // ADDED TO MANAGE RATE LIMITS while using SwaggerHub to mock APIs
        if (setUpIsDone) {
            return;
        }

        try {
            System.out.println("Sleep for 60 seconds");
            Thread.sleep(60000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        // do the setup
        setUpIsDone = true;
	}

	public void tearDown() {
		accountingApi = null;
        defaultClient = null;
	}

    @Test
    public void createPaymentServiceTest() throws IOException {
        System.out.println("@Test - createPaymentService");
        PaymentServices paymentServices = new PaymentServices();
        PaymentServices response = accountingApi.createPaymentService(paymentServices);

        assertThat(response.getPaymentServices().get(0).getPaymentServiceID(), is(equalTo(UUID.fromString("54b3b4f6-0443-4fba-bcd1-61ec0c35ca55"))));
        assertThat(response.getPaymentServices().get(0).getPaymentServiceName(), is(equalTo("PayUpNow")));
        assertThat(response.getPaymentServices().get(0).getPaymentServiceUrl(), is(equalTo("https://www.payupnow.com/")));
        assertThat(response.getPaymentServices().get(0).getPayNowText(), is(equalTo("Time To Pay")));
        assertThat(response.getPaymentServices().get(0).getPaymentServiceType(), is(equalTo("Custom")));
        assertThat(response.getPaymentServices().get(0).getValidationErrors().get(0).getMessage(), is(equalTo("Payment service could not be found")));
        //System.out.println(response.getPaymentServices().get(0).toString());
    }

    @Test
    public void getPaymentServicesTest() throws IOException {
        System.out.println("@Test - getPaymentServices");
        PaymentServices response = accountingApi.getPaymentServices();

        assertThat(response.getPaymentServices().get(0).getPaymentServiceID(), is(equalTo(UUID.fromString("54b3b4f6-0443-4fba-bcd1-61ec0c35ca55"))));
        assertThat(response.getPaymentServices().get(0).getPaymentServiceName(), is(equalTo("PayUpNow")));
        assertThat(response.getPaymentServices().get(0).getPaymentServiceUrl(), is(equalTo("https://www.payupnow.com/")));
        assertThat(response.getPaymentServices().get(0).getPayNowText(), is(equalTo("Time To Pay")));
        assertThat(response.getPaymentServices().get(0).getPaymentServiceType(), is(equalTo("Custom")));
        //System.out.println(response.getPaymentServices().get(0).toString());
    }
}