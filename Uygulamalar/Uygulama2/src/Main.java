import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Boy giriniz (m):");
        var stringBoy = scanner.nextLine();
        stringBoy = stringBoy.replace(",",".");
        var boy = Float.parseFloat(stringBoy);
        System.out.println("Ağırlık giriniz (kg)");
        var kilo = Float.parseFloat(scanner.nextLine().replace(",","."));
        var bmi = kilo / Math.pow(boy,2);
        if(bmi < 18.5){
            System.out.println("Düşük");
        }
        else if(bmi<24.9){
            System.out.println("Normal");
        }
        else{
            System.out.println("Çok");
        }
    }
}