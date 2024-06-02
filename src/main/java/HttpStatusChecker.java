import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    private static final String GET = "GET";
    private static final int SERVER_NOT_FOUND =  404;

    public String getStatusImage(int code) throws Exception {
        String result = "https://http.cat/" + code + ".jpg";
        HttpURLConnection connection = createConnection(result, GET);
        if (connection.getResponseCode() == SERVER_NOT_FOUND) {
            throw new Exception("Invalid status code " + code);
        }
        return result;
    }

    private HttpURLConnection createConnection(String path, String method) throws IOException {
        URL connectionUrl = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) connectionUrl.openConnection();
        connection.setRequestMethod(method);
        return connection;
    }
}
