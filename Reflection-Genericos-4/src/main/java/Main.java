import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<String> stringList = new ArrayList<>();
        stringList.add("Hollow");
        stringList.add("Knight");
        stringList.add("Silksong");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(9);
        integerList.add(1);
        integerList.add(2);

        imprimirLista(stringList);
        imprimirLista(integerList);
    }
    public static <T> void imprimirLista(List<T> lista){
        System.out.println(lista);
    }
}
