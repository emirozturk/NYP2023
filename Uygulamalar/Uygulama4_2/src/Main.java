import java.util.ArrayList;
import java.util.List;

/*
class Kuyruk {
    private int[] elemanlar;
    private int sayac;
    public Kuyruk(int kuyrukBuyuklugu){
        elemanlar = new int[kuyrukBuyuklugu];
        sayac = 0;
    }
    public boolean ekle(int eleman){
        if(sayac == elemanlar.length)return false;
        elemanlar[sayac]=eleman;
        sayac++;
        return true;
    }
    public int cikar(){
        if(sayac==0)return -1;
        var cikartilan = elemanlar[0];
        for(int i=0;i<sayac;i++)
            elemanlar[i]=elemanlar[i+1];
        sayac--;
        return cikartilan;
    }
    //⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
    //⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠BUNU HENÜZ BİLMEMİZE GEREK YOK⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
    //⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
    public String toString(){
        var sonuc= new StringBuilder();
        sonuc.append("Kuyruk: ");
        for(int i=0;i<sayac;i++)
            sonuc.append(elemanlar[i]).append(" ");
        return sonuc.toString();
    }

    public String yazdir(){
        String sonuc="";
        sonuc+="Kuyruk: ";
        for(int i=0;i<sayac;i++)
            sonuc += elemanlar[i]+" ";
        return sonuc;
    }
}
*/
class Kuyruk {
    private List<Integer> elemanlar;
    public Kuyruk(int elemanSayisi){
        elemanlar = new ArrayList<>(elemanSayisi);
    }
    public boolean ekle(int eleman){
        elemanlar.add(eleman);
        return true;
    }
    public int cikar(){
        var cikarilan = elemanlar.get(0);
        elemanlar.remove(0);
        return cikarilan;
    }
    //⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
    //⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠BUNU HENÜZ BİLMEMİZE GEREK YOK⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
    //⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠
    public String toString(){
        var sonuc= new StringBuilder();
        sonuc.append("Kuyruk: ");
        for (Integer integer : elemanlar) sonuc.append(integer).append(" ");
        return sonuc.toString();
    }

    public String yazdir(){
        String sonuc="";
        sonuc+="Kuyruk: ";
        for(var eleman:elemanlar)
            sonuc += eleman + " ";
        return sonuc;
    }
}
public class Main {
    public static void main(String[] args) {
        Kuyruk kuyruk = new Kuyruk(10);
        kuyruk.ekle(5);
        System.out.println(kuyruk.yazdir());
        kuyruk.ekle(15);
        System.out.println(kuyruk.yazdir());
        kuyruk.ekle(3);
        System.out.println(kuyruk.yazdir());
        System.out.println("Çıkartılan eleman:"+kuyruk.cikar());
        System.out.println(kuyruk);
        kuyruk.ekle(2);
        System.out.println(kuyruk);
        kuyruk.ekle(27);
        System.out.println(kuyruk);
        System.out.println("Çıkartılan eleman:"+kuyruk.cikar());
        System.out.println(kuyruk);
    }
}