import java.util.Scanner;

public class Main {
    static String bmiHesapla(float boy,float kilo){
        var bmi = kilo / Math.pow(boy,2);
        if(bmi < 18.5) return "Düşük";
        else if(bmi<24.9) return "Normal";
        return "Çok";
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int sayac=0;
        while(sayac<3){
            System.out.println((sayac+1)+". kişi:");
            System.out.println("Boy giriniz (m):");
            var stringBoy = scanner.nextLine();
            stringBoy = stringBoy.replace(",",".");
            var boy = Float.parseFloat(stringBoy);
            if(boy<0){
                System.out.println("Yanlış boy değeri");
                continue;
            }
            System.out.println("Ağırlık giriniz (kg)");
            var kilo = Float.parseFloat(scanner.nextLine().replace(",","."));
            if(kilo<0){
                System.out.println("Yanlış kilo değeri");
                continue;
            }
            var sonuc = bmiHesapla(boy,kilo);
            System.out.println(sonuc);
            sayac++;
        }
    }
}