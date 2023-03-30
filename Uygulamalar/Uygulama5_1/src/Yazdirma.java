import java.nio.file.Files;
import java.nio.file.Path;
import java.time.MonthDay;

public class Yazdirma {
    String tur = "";
    Path yol;
    public Yazdirma(Path yol){
        tur = "Dosya";
        this.yol = yol;
    }
    public Yazdirma(){
        tur = "Ekran";
    }
    private String baslikOlustur(String karakter){
        return karakter+"**********\n*";
    }
    private String altMetinOlustur(){
         return "*\n***********";
    }
    private String hazirla(int sayi){
        String cikti = "";
        cikti += baslikOlustur("i");
        cikti += String.format("%9d",sayi);
        cikti += altMetinOlustur();
        return cikti;
    }
    private String hazirla(float ondalikliSayi){
        String cikti = "";
        cikti += baslikOlustur("f");
        cikti += String.format("%9.2f",ondalikliSayi);
        cikti += altMetinOlustur();
        return cikti;
    }
    private String hazirla(String metin){
        String cikti = "";
        cikti += baslikOlustur("s");
        cikti += String.format("%9s",metin);
        cikti += altMetinOlustur();
        return cikti;
    }
    public void yazdir(int sayi){
        if(tur.equals("Ekran")){
            System.out.println(hazirla(sayi));
        }
        else if(tur.equals("Dosya")){
            try{
                Files.writeString(yol,hazirla(sayi));
            }catch (Exception ex){}
        }
    }
    public void yazdir(float ondalikliSayi){
        if(tur.equals("Ekran")){
            System.out.println(hazirla(ondalikliSayi));
        }
        else if(tur.equals("Dosya")){
            try {
                Files.writeString(yol,hazirla(ondalikliSayi));
            }catch (Exception ex){}
        }
    }
    public void yazdir(String metin){
        if(tur.equals("Ekran")){
            System.out.println(hazirla(metin));
        }
        else if(tur.equals("Dosya")){
            try {
                Files.writeString(yol,hazirla(metin));
            }catch (Exception ex){}
        }
    }
}
