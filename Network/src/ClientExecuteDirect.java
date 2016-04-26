import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Created by Robin on 2016. 4. 27..
 */
public class ClientExecuteDirect {
    public static void main(String[] args) throws Exception{
        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpHost target = new HttpHost("www.apache.org",80,"http");
        HttpGet req  = new HttpGet("/");

        System.out.println("Executing request ot " + target);

        HttpResponse response = httpclient.execute(target,req);

    }
}
