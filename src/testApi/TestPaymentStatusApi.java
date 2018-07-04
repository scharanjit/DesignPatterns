package testApi;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class TestPaymentStatusApi {


    public static void main(String[] args) throws IOException {

        // Define the server endpoint to send the HTTP request to
        URL serverUrl = new URL("http://localhost:8080/services/updatepaymentstatus");
        HttpURLConnection urlConnection = (HttpURLConnection) serverUrl.openConnection();

        // Indicate that we want to write to the HTTP request body
        urlConnection.setDoOutput(true);
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("WM_AUTH_TOKEN", "d80877b85e1bebc3b98251269906238d");
        urlConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");

        // Writing the post data to the HTTP request body
        BufferedWriter httpRequestBodyWriter =
                new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream()));
        httpRequestBodyWriter.write("{\"status\" : \"Success\",\"message\":\"this is optional\",\"patientOrderId\":null}");

        httpRequestBodyWriter.close();

        // Reading from the HTTP response body
        Scanner httpResponseScanner = new Scanner(urlConnection.getInputStream());
        while (httpResponseScanner.hasNextLine()) {
            System.out.println(httpResponseScanner.nextLine());
        }
        httpResponseScanner.close();

    }

}

