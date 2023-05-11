import java.awt.*;

public class Daire extends Sekil{
    private int yaricap;
    public Daire(int yaricap, Color renk){
        this.yaricap = yaricap;
        this.renk = renk;
    }
    @Override
    public void cevreHesapla() {
        System.out.println(2*Math.PI*yaricap);
    }
}
