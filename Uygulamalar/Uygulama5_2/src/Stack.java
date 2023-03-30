import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    private List<E> elemanlar;

    public Stack(){
        elemanlar = new ArrayList<>();
    }
    public void push(E eleman){
        elemanlar.add(eleman);
    }

    public E operateLasElement(boolean delete){
        if(elemanlar.size()==0)
            return null;
        var dondurulecek = elemanlar.get(elemanlar.size()-1);
        if(delete) elemanlar.remove(elemanlar.size()-1);
        return dondurulecek;
    }

    public E pop(){
        return operateLasElement(true);
    }

    public E peek(){
        return operateLasElement(false);
    }

    public String yazdir(){
        StringBuilder cikti = new StringBuilder("Stack:\n");
        for(int i=elemanlar.size()-1;i>=0;i--){
            cikti.append(String.format("|%15s|\n", elemanlar.get(i)));
            cikti.append("-----------------\n");
        }
        return cikti.toString();
    }
}
