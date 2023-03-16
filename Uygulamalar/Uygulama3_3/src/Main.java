import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var kayitListesi = new KayitListesi("/Users/emirozturk/Desktop/songs.txt");//Kendi dosya yolunuza düzeltmeniz gerekiyor
        var adSonucu = kayitListesi.adaGoreAra("Letgo");
        for(var kayit : adSonucu) System.out.println(kayit.yazdir());

        var turSonucu = kayitListesi.tureGoreAra("Rock");
        for(var kayit : turSonucu) System.out.println(kayit.yazdir());
    }
}