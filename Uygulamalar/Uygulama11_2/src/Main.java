import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Sekil sekil = new Sekil(); //Şekil soyut olduğu için bir nesne alınamaz
        Sekil kare = new Kare(5, Color.blue);
        Sekil daire = new Daire(5,Color.magenta);
        kare.cevreHesapla();
        daire.cevreHesapla();
        kare.renkGoster();
        daire.renkGoster();

    }
}