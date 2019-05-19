package gr.teicm.ieee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class StartClass {

    public static void main(final String... args) throws URISyntaxException, IOException, InterruptedException {
        System.out.println("Hello world!");

        int aInteger = 4;

        System.out.println("The Integer " + aInteger);

        aInteger = 2; // Or 11

        System.out.println("The Integer " + aInteger);

        if(aInteger > 5) {
            System.out.println("The Integer is 5<" + aInteger);
        }

        /*

         { name: "IEEE", email: "ieee@teicm.gr" }

         */

        String url = "https://reqres.in/api/users";

        HttpClient aClient = HttpClient.newBuilder().build();

        HttpRequest aRequest = HttpRequest.newBuilder()
                .GET()
                .uri(new URI(url))
                .build();

        var send = aClient.send(aRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(send.body());
    }
}
