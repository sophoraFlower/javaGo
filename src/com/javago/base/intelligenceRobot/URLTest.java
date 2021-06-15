package com.javago.base.intelligenceRobot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLTest {

    public static void main(String[] args) throws IOException {
        String urlString = "https://api.xdclass.net/pub/api/v1/web/index_card";
        URL url = new URL(urlString);
        System.out.println("Host：" + url.getHost());  // api.xdclass.net
        System.out.println("Protocol：" + url.getProtocol());  // https
        System.out.println("Port：" + url.getPort());  // -1
        System.out.println("Path：" + url.getPath());  // /pub/api/v1/web/index_card
        System.out.println("Query：" + url.getQuery());  // null
        System.out.println("File：" + url.getFile());  // /pub/api/v1/web/index_card

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        int responseCode = connection.getResponseCode();
        if (200 <= responseCode && responseCode <= 299) {
            try (InputStream inputStream = connection.getInputStream();
                 BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            ) {
                StringBuilder response = new StringBuilder();
                String currentLine;
                while ((currentLine = in.readLine()) != null) {
                    response.append(currentLine);
                }
                System.out.println(response);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
