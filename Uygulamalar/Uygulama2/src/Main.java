import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String bmiHesapla(float boy,float kilo){
        var bmi = kilo / Math.pow(boy,2);
        if(bmi < 18.5) return "Düşük";
        else if(bmi<24.9) return "Normal";
        return "Çok";
    }
    public static void main(String[] args) {
        var bmiListesi = new ArrayList<String>();
        var scanner = new Scanner(System.in);
        int sayac=0;
        float boy,kilo;
        while(sayac<3){
            /*
            try{
                System.out.println((sayac+1)+". kişi:");
                System.out.println("Boy giriniz (m):");
                var stringBoy = scanner.nextLine();
                stringBoy = stringBoy.replace(",",".");
                boy = Float.parseFloat(stringBoy);
                if(boy<0){
                    System.out.println("Yanlış boy değeri");
                    continue;
                }
                System.out.println("Ağırlık giriniz (kg)");
                kilo = Float.parseFloat(scanner.nextLine().replace(",","."));
                if(kilo<0){
                    System.out.println("Yanlış kilo değeri");
                    continue;
                }
            }
            catch (Exception ex){
                System.out.println("Hatalı değer");
                continue;
            }
            */
            System.out.println((sayac+1)+". kişi:");
            System.out.println("Boy giriniz (m):");
            boy = scanner.nextFloat();
            System.out.println("Ağırlık giriniz (kg)");
            kilo = scanner.nextFloat();
            var sonuc = bmiHesapla(boy,kilo);
            bmiListesi.add(sonuc);
            System.out.println(sonuc);
            sayac++;
        }
        int[] sayaclar = new int[3];
        var etiketler = Arrays.asList("Düşük","Normal","Çok");
        for(var eleman:bmiListesi){
            switch (eleman) {
                case "Düşük" -> sayaclar[0]++;
                case "Normal" -> sayaclar[1]++;
                case "Çok" -> sayaclar[2]++;
            }
        }
        for(int i=0;i<sayaclar.length;i++){
            System.out.println(etiketler.get(i)+" grubunda "+ sayaclar[i]+" kişi var.");
        }
    }
}