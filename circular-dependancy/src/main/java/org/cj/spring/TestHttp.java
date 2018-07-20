package org.cj.spring;

import org.apache.http.client.methods.HttpPost;

public class TestHttp {

    public static void main(String[] args) {

        String path = "http://www.google.com";

        HttpPost httpPost = new HttpPost(path);
        String hostname = httpPost.getURI().getHost();
        int port = httpPost.getURI().getPort();
        String scheme = httpPost.getURI().getScheme();

        System.out.println(hostname+" "+port+" "+scheme);

    }
}
