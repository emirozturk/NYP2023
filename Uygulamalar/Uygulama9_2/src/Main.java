
public class Main {
    public static void main(String[] args) {
        var httpDownloader = Downloader.fromHttp("http://google.com");
        httpDownloader.download();
        var ftpDownloader = Downloader.fromFtp("ftp://hp.com");
        ftpDownloader.download();
        Downloader fileDownloader = Downloader.fromFile("file://dosya");
        fileDownloader.download();
    }
}