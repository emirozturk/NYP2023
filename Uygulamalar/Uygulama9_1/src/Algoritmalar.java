import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Algoritmalar {
    static int degisken;
    static int[] sirala(int[] dizi){
        for(int i=0;i<dizi.length;i++)
            for(int j=0;j<dizi.length;j++) {
                if(dizi[i]<dizi[j]){
                    int temp = dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j] = temp;
                }
            }
        return dizi;
    }
    static int[] hizliSirala(int[] dizi){
        for(int i=0;i<dizi.length;i++)
            for(int j=i;j<dizi.length;j++)
                if(dizi[i]<dizi[i+1]){
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
        return dizi;
    }
    static List<Integer> ara(int[] dizi, int aranan){
        var bulunanlar = new ArrayList<Integer>();
        for(int i=0;i<dizi.length;i++)
            if(dizi[i]==aranan)
                bulunanlar.add(i);
        return bulunanlar;
    }
}
