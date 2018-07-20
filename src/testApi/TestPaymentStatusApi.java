package testApi;

import sun.misc.BASE64Encoder;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TestPaymentStatusApi {


    public static void main(String[] args) throws IOException {

        // Define the server endpoint to send the HTTP request to
        URL serverUrl = new URL("http://localhost:9090/admin/persistHL7");
        HttpURLConnection urlConnection = (HttpURLConnection) serverUrl.openConnection();

        // Indicate that we want to write to the HTTP request body
        urlConnection.setDoOutput(true);
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type", "test/plain; charset=utf-8");

        BASE64Encoder enc = new sun.misc.BASE64Encoder();
        String username ="learn";
        String password ="share";
        String userpassword = username + ":" + password;
        String encodedAuthorization = enc.encode( userpassword.getBytes() );
        urlConnection.setRequestProperty("Authorization", "Basic "+
                encodedAuthorization);



        // Writing the post data to the HTTP request body
        BufferedWriter httpRequestBodyWriter =
                new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream()));
        httpRequestBodyWriter.write("yoo");

        httpRequestBodyWriter.close();

        // Reading from the HTTP response body
        Scanner httpResponseScanner = new Scanner(urlConnection.getInputStream());
        while (httpResponseScanner.hasNextLine()) {
            System.out.println(httpResponseScanner.nextLine());
        }
        httpResponseScanner.close();

    }

}

