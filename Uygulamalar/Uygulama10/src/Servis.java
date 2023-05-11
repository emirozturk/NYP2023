public class Servis {
    Veritabani veritabani;
    public Servis(Veritabani veritabani){
        this.veritabani = veritabani;
    }
    int ekle(Kayit kayit){
        return veritabani.ekle(kayit);
    }
    Kayit oku(int id){
        return veritabani.bul(id);
    }
}
