
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author boddy
 */

public class Haker {
    public static void main(String[] args) throws Exception{
        String path = "http://localhost:8080/JavaWeb20210531/controller/bmi_session";
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        // 塞入一個 Header
        conn.setRequestProperty("Cookie", "JSESSIONID=5D6FB86D7CCEF4908C1ABC83322D7231");
        conn.connect();
        InputStream is = conn.getInputStream();
        System.out.println(IOUtils.toString(is , "utf-8"));
        
    }
}
