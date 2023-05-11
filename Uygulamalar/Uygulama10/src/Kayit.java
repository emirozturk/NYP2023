public class Kayit {
    private int id;
    private String adSoyad;
    public Kayit(int id,String adSoyad){
        this.id = id;
        this.adSoyad = adSoyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    @Override
    public String toString() {
        return "id=" + id + " adSoyad='" + adSoyad + '\'';
    }
}