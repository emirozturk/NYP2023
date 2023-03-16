import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var kisi1 = new Kisi("Emir",300,"1060203022");
        var kisi2 = new Kisi("İlker",21,"1211602100");
        System.out.println(kisi1.yazdir());
        System.out.println(kisi2.yazdir());
        var kisiLisesi = new ArrayList<Kisi>();
        kisiLisesi.add(kisi1);
        kisiLisesi.add(kisi2);
        for(var kisi : kisiLisesi){
            System.out.println(kisi.getAd());
        }
    }
}