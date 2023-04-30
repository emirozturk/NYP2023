public class Main {
    public static void main(String[] args) {
        int[] dizi = new int[6];
        dizi[0]=3;
        dizi[1]=4;
        dizi[2]=1;
        dizi[3]=2;
        dizi[4]=7;
        dizi[5]=1;

        var indisler = Algoritmalar.ara(dizi,1);
        for(var eleman:indisler)
            System.out.print(eleman+" ");

        System.out.println();

        var siraliDizi = Algoritmalar.sirala(dizi);
        for (var eleman : siraliDizi) {
            System.out.print(eleman + " ");
        }
    }
}