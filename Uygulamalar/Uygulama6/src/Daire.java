import java.awt.*;

public class Daire extends Sekil{
    private int yaricap;
    public Daire(int yaricap, Color renk){
        this.yaricap = yaricap;
        this.renk = renk;
    }
    public double cevreHesapla(){
        return 2*Math.PI*yaricap;
    }
}
