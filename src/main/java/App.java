public class App {
    public static void main(String[] args) throws Exception {
        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
        httpStatusChecker.getStatusImage(200);
        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        httpStatusImageDownloader.downloadStatusImage(500);

        HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
        httpImageStatusCli.askStatus();

    }
}
