package org.cj.spring;

import org.apache.commons.httpclient.HttpClient;

import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;

import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * A simple example that uses HttpClient to perform a GET using Basic
 * Authentication. Can be run standalone without parameters.
 *
 * You need to have JSSE on your classpath for JDK prior to 1.4
 *
 * @author Michael Becke
 */
public class BasicAuthenticationExample {

    /**
     * Constructor for BasicAuthenticatonExample.
     */
    public BasicAuthenticationExample() {
        super();
    }

    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpclient = HttpClientBuilder.create().build();

        HttpHost targetHost = new HttpHost("localhost", 9090, "http");
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope(targetHost.getHostName(), targetHost.getPort()),
                new UsernamePasswordCredentials("learn", "share"));

// Create AuthCache instance
        AuthCache authCache = new BasicAuthCache();
// Generate BASIC scheme object and add it to the local auth cache
        BasicScheme basicAuth = new BasicScheme();
        authCache.put(targetHost, basicAuth);

// Add AuthCache to the execution context
        HttpClientContext context = HttpClientContext.create();
        context.setCredentialsProvider(credsProvider);
        context.setAuthCache(authCache);

//        HttpGet httpget = new HttpGet("/");
        HttpPost httpPost = new HttpPost("http://localhost:9090/admin/persistHL7");
//        httpPost.setHeader(   "Content-Type", "text/plain; charset=UTF-8");
        String bodyContent =  "TEST";
        StringEntity requestBody = new StringEntity(bodyContent);
        httpPost.setEntity(requestBody  );

        for (int i = 0; i < 3; i++) {
            CloseableHttpResponse response = httpclient.execute(
                    targetHost, httpPost, context);
            try {
                HttpEntity entity = response.getEntity();

                System.out.println(entity);
            } finally {
                response.close();
            }
        }
    }
    }