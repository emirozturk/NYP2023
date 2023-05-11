import java.awt.*;

public abstract class Sekil implements ISekil{
    protected Color renk;
    public void renkGoster(){
        if (renk == Color.blue){
            System.out.println("\u001B[34m" +"Bu renkte"+"\u001B[0m");
        }
        if (renk == Color.magenta){
            System.out.println("\u001B[45m" +"Bu renkte"+"\u001B[0m");
        }
    }
}
