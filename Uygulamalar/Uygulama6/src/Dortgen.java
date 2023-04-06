import java.awt.*;

public class Dortgen extends Sekil {
    private int birinciKenar;
    private int ikinciKenar;
    private int ucuncuKenar;
    private int dorduncuKenar;
    public Dortgen(int birinciKenar, int ikinciKenar, int ucuncuKenar, int dorduncuKenar, Color renk){
        this.birinciKenar = birinciKenar;
        this.ikinciKenar = ikinciKenar;
        this.ucuncuKenar = ucuncuKenar;
        this.dorduncuKenar = dorduncuKenar;
        this.renk = renk;
    }
    public int cevreHesapla() {
        return birinciKenar + ikinciKenar + ucuncuKenar + dorduncuKenar;
    }

}
