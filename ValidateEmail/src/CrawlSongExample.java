import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class CrawlSongExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
        try {
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // dong scanner
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

