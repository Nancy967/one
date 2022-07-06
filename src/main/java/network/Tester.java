package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://opendataap2.penghu.gov.tw/./resource/files/2022-06-23/ab8b9f31f05e6e1a7ecd1c624b089b36.json");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            StringBuffer json = new StringBuffer();
            while (line != null){
//                System.out.println(line);
                json.append(line);
                line = in.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
