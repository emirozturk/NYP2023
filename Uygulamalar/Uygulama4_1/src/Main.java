class Kutu{
    private int en;
    private int boy;
    private int yukseklik;
    public Kutu(int en,int boy,int yukseklik){
        this.en = en;
        this.boy = boy;
        this.yukseklik = yukseklik;
    }
    public void setEn(int en){
        this.en = en;
    }
    public int getEn(){
        return en;
    }
}
public class Main {
    public static void fonksiyon(Kutu degisken){
        //degisken = new Kutu(5,5,5);
        degisken.setEn(10);
    }
    public static void main(String[] args) {
        Kutu k = new Kutu(3,3,3);
        fonksiyon(k);
        System.out.println(k.getEn());
    }
}