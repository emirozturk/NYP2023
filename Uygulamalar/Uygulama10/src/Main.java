public class Main {
    public static void main(String[] args) {
        Servis s = new Servis(new MssqlDb());
        var kayit = s.oku(2);
        System.out.println(kayit);
    }
}