public class Kayit {
    private String sanatci;
    private String parcaAdi;
    private String tur;
    public Kayit(String sanatci,String parcaAdi,String tur){
        this.sanatci = sanatci;
        this.parcaAdi = parcaAdi;
        this.tur = tur;
    }
    public String getParcaAdi(){
        return parcaAdi;
    }
    public String yazdir(){
        return "Sanatçı:" + sanatci + " Parça:" + parcaAdi + " Tür:" + tur;
    }

    public String getTur() {
        return tur;
    }
}
