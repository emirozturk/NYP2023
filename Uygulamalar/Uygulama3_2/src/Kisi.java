public class Kisi {
    private String ad;
    private int _yas;
    private String _no;

    public String yazdir() {
        return "*" + ad + " " + _yas + " " + _no;
    }

    public Kisi(String ad, int yas, String no) {
        this.ad = ad;
        _yas = yas;
        _no = no;
    }
    public String getAd(){
        return ad;
    }
}
