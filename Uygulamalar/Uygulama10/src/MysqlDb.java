public class MysqlDb implements Veritabani {
    public int ekle(Kayit kayit){
        Kayitlar.mysqlKayitlar.add(kayit);
        return 1;
    }
    public Kayit bul(int id){
        for(var kayit: Kayitlar.mysqlKayitlar)
            if(kayit.getId()==id)
                return kayit;
        return null;
    }
}
