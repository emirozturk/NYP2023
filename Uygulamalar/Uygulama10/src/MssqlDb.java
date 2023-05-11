public class MssqlDb implements Veritabani {
    public int ekle(Kayit kayit){
        Kayitlar.mssqlKayitlar.add(kayit);
        return 1;
    }
    public Kayit bul(int id){
        for(var kayit: Kayitlar.mssqlKayitlar)
            if(kayit.getId()==id)
                return kayit;
        return null;
    }
}
