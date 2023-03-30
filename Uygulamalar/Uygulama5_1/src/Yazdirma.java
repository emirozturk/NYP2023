public class Yazdirma {
    private void baslikYazdir(String karakter){
        System.out.println(karakter+"**********");
        System.out.print("*");
    }
    private void altMetinYazdir(){
        System.out.println("*");
        System.out.println("***********");
    }
    public void yazdir(int sayi){
        baslikYazdir("i");
        System.out.printf("%9d",sayi);
        altMetinYazdir();
    }
    public void yazdir(float ondalikliSayi){
        baslikYazdir("f");
        System.out.printf("%9.2f",ondalikliSayi);
        altMetinYazdir();
    }
    public void yazdir(String metin){
        baslikYazdir("s");
        System.out.printf("%9s",metin);
        altMetinYazdir();
    }
}
