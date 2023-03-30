import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        var yazdirma1 = new Yazdirma();
        yazdirma1.yazdir(13487);
        yazdirma1.yazdir(183.439f);
        yazdirma1.yazdir("Deneme");
        var yazdirma2 = new Yazdirma(Path.of("/Users/emirozturk/Desktop/cikti.txt"));
        yazdirma2.yazdir(13487);
        yazdirma2.yazdir(183.439f);
        yazdirma2.yazdir("Deneme");
    }
}