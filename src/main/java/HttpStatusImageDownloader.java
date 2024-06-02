import java.io.*;
import java.net.URL;

public class HttpStatusImageDownloader {
    private HttpStatusChecker statusChecker = new HttpStatusChecker();

    void downloadStatusImage(int code) throws Exception {

        try (BufferedInputStream in = new BufferedInputStream(new URL(statusChecker.getStatusImage(code)).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream( code + ".jpg")) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Image for status code " + code + " downloaded and saved as " + code + ".jpg");
        } catch (IOException e) {
            throw new Exception("Failed to download image for status code " + code, e);
        }
    }

}
