import java.util.*;

class Sinif{
    int id;
    String ad;

    public Sinif(int id,String ad) {
        this.id = id;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Sinif{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }
}

public class Main {
    public static int karsilastirici(Sinif a,Sinif b){
        if(a.id>b.id)return -1;
        if(a.id==b.id)return 0;
        return 1;
    }
    public static int comparator(int a,int b){
        if(a>b)return -1;
        if(a==b)return 0;
        return 1;
    }
    public static void fonk(int... parametreler){
        for(var x : parametreler)
            System.out.println(x);
    }
    public static void main(String[] args) {
        var liste = new ArrayList<>(Arrays.asList(1,2,3,5435,123,54,12123,4754,2133,765,454,578));
        /*
        var sinifListesi = new ArrayList<Sinif>(Arrays.asList(
                new Sinif(1,"emir"),
                new Sinif(2,"izmir"),
                new Sinif(3,"ahmet")
        ));
        for(int i=0;i<liste.size();i++)
            for(int j=0;j<liste.size();j++)
                if(liste.get(i)>liste.get(j)){
                    int temp = liste.get(i);
                    liste.set(i,liste.get(j));
                    liste.set(j,temp);
                }

        Collections.sort(sinifListesi,Main::karsilastirici);
        sinifListesi.forEach(System.out::println);
        liste.add(23);
        liste.add(432);
        liste.add(834);
        Collections.addAll(liste,23,432,834,634);
        //fonk(3,25,234,123,245,213,463);
        Collections.sort(liste);
        System.out.println(Collections.binarySearch(liste,5435));
        var sonuc = liste.stream().filter(e->e>55).sorted().skip(2);
         */

        //liste.forEach(System.out::println);
    }
}