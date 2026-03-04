package MD2.Bai19.BaiTap.Bai3;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CrawlNewsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://vnexpress.net/thoi-su");
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            Scanner scanner = new Scanner(inputStreamReader);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            content = content.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile("class=\"title-news\"><a[^>]*>(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (MalformedURLException e) {
            System.out.println("URL form error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
