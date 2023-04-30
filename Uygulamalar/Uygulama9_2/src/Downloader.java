public class Downloader {
    private final String protocol;
    private final String downloadLink;
    private Downloader(String link,String protocol){
        downloadLink = link;
        this.protocol = protocol;
    }
    public static Downloader fromHttp(String link){
        return new Downloader(link,"http");
    }
    public static Downloader fromFtp(String link){
        return new Downloader(link,"ftp");
    }

    public static Downloader fromFile(String link) {
        return new Downloader(link,"file");
    }

    public byte[] download(){
        switch (protocol) {
            case "http" -> {
                System.out.println(downloadLink + " ile Http bağlantısı yapıldı.");
            }
            case "ftp" -> {
                System.out.println(downloadLink + " ile Ftp bağlantısı yapıldı.");
            }
            case "file" -> {
                System.out.println(downloadLink + " ile Dosya kopyalaması başlatıldı");
            }
        }
        return new byte[1];
    }
}
