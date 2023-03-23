public class Main {
    public static int fonksiyon(int deger){
        deger = 100;
        return deger;
    }
    public static void main(String[] args) {
        int deger = 10;
        deger = fonksiyon(deger);
        System.out.println(deger);
    }
}