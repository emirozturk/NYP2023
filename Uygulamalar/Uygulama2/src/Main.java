import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var degisken = 98234;
        System.out.println(degisken);
        var scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        var ekrandanAlinan = scanner.nextInt();
        degisken = ekrandanAlinan;
        System.out.println(degisken);
    }
}