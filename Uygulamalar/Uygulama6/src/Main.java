import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void renkGoster(Sekil s){
        s.renkYazdir();
        /*
        if(s instanceof Kare)
            System.out.println(((Kare)s).cevreHesapla());
        else if(s instanceof Daire)
            System.out.println(((Daire)s).cevreHesapla());
         */
    }
    public static void main(String[] args) {
        /*
        var kare = new Kare(5,Color.blue);
        System.out.println(kare.cevreHesapla());
        kare.renkYazdir();
        var daire = new Daire(3,Color.green);
        System.out.println(daire.cevreHesapla());
        daire.renkYazdir();
        */
        Kare kare = new Kare(5,Color.red);
        renkGoster(kare);
        Daire daire = new Daire(3,Color.green);
        renkGoster(daire);
    }
}