import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Boy giriniz (m):");
        var boy = scanner.nextFloat();
        System.out.println("Ağırlık giriniz (kg)");
        var kilo = scanner.nextFloat();
        var bmi = kilo / Math.pow(boy,2);
        if(bmi < 18.5)
            System.out.println("Düşük");
        if(bmi>18.5 && bmi<24.9)
            System.out.println("Normal");
        if(bmi > 24.9)
            System.out.println("Çok");
    }
}