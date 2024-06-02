import java.util.Scanner;

public class HttpImageStatusCli {

    private HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();

    void askStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code");
        int status = scanner.nextInt();
        try {
            downloader.downloadStatusImage(status);
        } catch (Exception e) {
            System.out.println("Please enter valid number");
        }

    }
}
