package Chapter9;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {

    @Test
    public void test01() throws IOException {
        // 用来存放结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        // 执行get方法
        // HttpClient client = new DefaultHttpClient();
        CloseableHttpClient client = HttpClients.createDefault();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(), "UTF-8");
        System.out.println(result);
    }

}
