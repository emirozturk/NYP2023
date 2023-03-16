import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Kayit> adaGoreAra(List<Kayit> kayitlar, String ad){
        var sonucListesi = new ArrayList<Kayit>();
        for(var kayit : kayitlar)
            if(kayit.getParcaAdi().equals(ad))
                sonucListesi.add(kayit);
        return sonucListesi;
    }
    public static List<Kayit> tureGoreAra(List<Kayit> kayitlar, String tur){
        var sonucListesi = new ArrayList<Kayit>();
        for(var kayit: kayitlar)
            if(kayit.getTur().equals(tur))
                sonucListesi.add(kayit);
        return sonucListesi;
    }
    public static void main(String[] args) throws IOException {
        var dosyaYolu = "/Users/emirozturk/Desktop/songs.txt"; //Kendi dosya yolunuza düzeltmeniz gerekiyor
        var liste = Files.readAllLines(Path.of(dosyaYolu));
        var kayitListesi = new ArrayList<Kayit>();
        for(var satir:liste) {
            var parcalar = satir.split("-");
            var sanatciAdi = parcalar[0];
            var parcaAdi = parcalar[1];
            var tur = parcalar[2];
            var kayit = new Kayit(sanatciAdi, parcaAdi, tur);
            kayitListesi.add(kayit);
        }
        var adSonucu = adaGoreAra(kayitListesi,"Letgo");
        for(var kayit : adSonucu)
            System.out.println(kayit.yazdir());

        var turSonucu = tureGoreAra(kayitListesi,"Rock");
        for(var kayit : turSonucu)
            System.out.println(kayit.yazdir());
    }
}