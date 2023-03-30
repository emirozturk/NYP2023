import java.time.MonthDay;

public class Yazdirma {
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
        System.out.println(hazirla(sayi));
    }
    public void yazdir(float ondalikliSayi){
        System.out.println(hazirla(ondalikliSayi));
    }
    public void yazdir(String metin){
        System.out.println(hazirla(metin));
    }
}
