import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Islem{
    public static List<Integer> stringListToIntList(List<String> liste){
        var sayiListesi = new ArrayList<Integer>();
        for(var eleman:liste)
            sayiListesi.add(Integer.parseInt(eleman));
        return sayiListesi;
    }
    public static List<Integer> elemeYap(List<Integer> liste,int sinir){
        var elenmisSayiListesi = new ArrayList<Integer>();
        for(var eleman:liste)
            if(eleman>sinir)
                elenmisSayiListesi.add(eleman);
        return elenmisSayiListesi;
    }
    public static List<Integer> aralikAl(List<Integer> liste,int baslangic,int bitis){
        var aralik = new ArrayList<Integer>();
        for(int i=baslangic;i<bitis+1;i++)
            aralik.add(liste.get(i));
        return aralik;
    }
    public static List<Integer> kareAl(List<Integer> liste){
        var kareler = new ArrayList<Integer>();
        for(int i=0;i<liste.size();i++)
            kareler.add((int)Math.pow(liste.get(i),2));
        return kareler;
    }
    public static List<Integer> sirala(List<Integer> liste){
        for(int i=0;i<liste.size();i++)
            for(int j=0;j<liste.size();j++)
                if(liste.get(i)<liste.get(j)){
                    int temp = liste.get(i);
                    liste.set(i,liste.get(j));
                    liste.set(j,temp);
                }
        return liste;
    }
    public static List<String> intListtoStringList(List<Integer> liste){
        var sonuc = new ArrayList<String>();
        for(var e:liste)
            sonuc.add(e.toString());
        return sonuc;
    }
}
public class Uyg2 {
    public static void main(String[] args) {
        var liste = new ArrayList<>(Arrays.asList("1","2","3","5435","123","54","12123","4754","2133","765","454","578","654","26","98","41","444","666","86","23","567"));
        /*
        Liste içerisindeki 50den büyük sayıların 5. elemandan 10. elemana kadar olanlarını alan ve
        bu sayıların karelerini küçükten büyüğe sıralayıp bir string dizisi olarak döndüren metot
         */
        /*
                var sayiListesi = new ArrayList<Integer>();
        for(var eleman:liste)
            sayiListesi.add(Integer.parseInt(eleman));
        var elenmisSayiListesi = new ArrayList<Integer>();
        for(var eleman:sayiListesi)
            if(eleman>50)
                elenmisSayiListesi.add(eleman);
        var besIleOnArasi = new ArrayList<Integer>();
        for(int i=5;i<11;i++){
            besIleOnArasi.add(elenmisSayiListesi.get(i));
        }
        var kareler = new ArrayList<Integer>();
        for(int i=0;i<besIleOnArasi.size();i++)
            kareler.add((int)Math.pow(besIleOnArasi.get(i),2));
        for(int i=0;i<kareler.size();i++)
            for(int j=0;j<kareler.size();j++)
                if(kareler.get(i)<kareler.get(j)){
                    int temp = kareler.get(i);
                    kareler.set(i,kareler.get(j));
                    kareler.set(j,temp);
                }
        var sonuc = new ArrayList<String>();
        for(var e:kareler)
            sonuc.add(e.toString());
        sonuc.forEach(System.out::println);
         */
        /*
        var sayiListesi = Islem.stringListToIntList(liste);
        var elenmisSayiListesi = Islem.elemeYap(sayiListesi,50);
        var besIleOnArasi = Islem.aralikAl(elenmisSayiListesi,5,10);
        var kareler = Islem.kareAl(besIleOnArasi);
        var siralanmis = Islem.sirala(kareler);
        var sonuc = Islem.intListtoStringList(siralanmis);
        var sonuc = Islem.intListtoStringList(Islem.sirala(Islem.kareAl(Islem.aralikAl(Islem.elemeYap(Islem.stringListToIntList(liste),50),5,10))));
         */
                /*
        Liste içerisindeki 50den büyük sayıların 5. elemandan 10. elemana kadar olanlarını alan ve
        bu sayıların karelerini küçükten büyüğe sıralayıp bir string dizisi olarak döndüren metot
         */
        var sonuc = liste.stream().
                    mapToInt(Integer::parseInt).
                    filter(x->x>50).
                    skip(5).
                    limit(6).
                    map(x->x*x).
                    sorted().
                    mapToObj(Integer::toString).
                    toList();

        sonuc.forEach(System.out::println);
    }
}
