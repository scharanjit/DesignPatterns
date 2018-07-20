import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class HttpPostJava {

    public static void main(String[] args) {

            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost("http://localhost:9090/admin/persistHL7");

            // Create some NameValuePair for HttpPost parameters
            List<NameValuePair> arguments = new ArrayList<>(3);
            arguments.add(new BasicNameValuePair("username", "learn"));
            arguments.add(new BasicNameValuePair("password", "share"));


            String result ="xx";


            try {

                String bodyContent = "{  'data': {    'score': '5x1',     'time': '15:10'   },   'to' : 'bk3RNwTe3H0:CI2k_HHwgIpoDKCIZvvDMExUdFQ3P1...'}";
                StringEntity requestBody = new StringEntity(bodyContent);
                post.setEntity(requestBody);
                post.setEntity(new UrlEncodedFormEntity(arguments));

                post.setHeader("Content-Type", "test/plain");
                post.setHeader("Authorization", "key=AIzaSyZ-1u...0GBYzPu7Udno5aA");

                HttpResponse response = client.execute(post);

                // Print out the response message
                System.out.println(EntityUtils.toString(response.getEntity()));
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
