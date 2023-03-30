class Sinif{
    int a;
    int b;
    int c;
    public Sinif(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Sinif(int a,int b){
        this.a = a;
        this.b = b;
        c = -1;
    }
    public Sinif(int a){
        this.a = a;
        b = -1;
        c = -1;
    }
    public Sinif(){

    }
    public String toString(){
        return String.format("%d %d %d",a,b,c);
    }
}
public class Main {
    public static void main(String[] args) {
        var nesne1 = new Sinif();
        System.out.println(nesne1);
        var nesne2 = new Sinif(1);
        System.out.println(nesne2);
        var nesne3 = new Sinif(1,2);
        System.out.println(nesne3);
        var nesne4 = new Sinif(1,2,3);
        System.out.println(nesne4);

        var yazdirma = new Yazdirma();
        yazdirma.yazdir(13487);
        yazdirma.yazdir(183.439f);
        yazdirma.yazdir("Deneme");
    }
}