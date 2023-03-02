import java.util.Scanner;

public class Main {
    static void fonk(int deger){
        deger = deger * 10;
    }
    public static void main(String[] args) {
        int a = 0;
        a = 3;
        fonk(a);
        fonk(123);
        fonk(5342);
        Scanner s = new Scanner(System.in);
        var deger = s.nextInt();
    }
}