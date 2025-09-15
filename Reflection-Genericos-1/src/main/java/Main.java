import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){

        Caja<String> stringCaja = new Caja<>();
        stringCaja.setContenido("Nueve doce");
        System.out.println(stringCaja);

        Caja<Integer> integerCaja = new Caja<>();
        integerCaja.setContenido(912);
        System.out.println(integerCaja);

        List lista = new ArrayList<>();
        lista.add("Nueve doce");
        lista.add(912);

        String textoLista = (String) lista.get(0);
        Integer numLista = (Integer) lista.get(1);

        System.out.println(textoLista);
        System.out.println(numLista);
    }
}
