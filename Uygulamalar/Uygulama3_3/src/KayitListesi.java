import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class KayitListesi {
    private List<Kayit> kayitListesi;
    public KayitListesi(String dosyaYolu) throws IOException {
        var liste = Files.readAllLines(Path.of(dosyaYolu));
        kayitListesi = new ArrayList<>();
        for(var satir:liste) {
            var parcalar = satir.split("-");
            kayitListesi.add(new Kayit(parcalar[0], parcalar[1], parcalar[2]));
        }
    }
    public List<Kayit> adaGoreAra(String ad){
        var sonucListesi = new ArrayList<Kayit>();
        for(var kayit : kayitListesi)
            if(kayit.getParcaAdi().equals(ad))
                sonucListesi.add(kayit);
        return sonucListesi;
    }
    public List<Kayit> tureGoreAra(String tur){
        var sonucListesi = new ArrayList<Kayit>();
        for(var kayit: kayitListesi)
            if(kayit.getTur().equals(tur))
                sonucListesi.add(kayit);
        return sonucListesi;
    }
}
