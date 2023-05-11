import java.awt.*;

public class Kare extends Sekil {
    private int kenar;
    public Kare(int kenar, Color renk){
        this.kenar = kenar;
        this.renk = renk;
    }
    @Override
    public void cevreHesapla() {
        System.out.println(4*kenar);
    }
}
