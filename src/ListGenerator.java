package src;
import java.util.ArrayList;
import java.util.Collections;


public class ListGenerator {
    public static ArrayList<Integer> lista(int size, boolean sorted) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        // Fill the list with numbers from 1 to size
        for (int i = 1; i <= size; i++) {
            lista.add(i);
        }

        // Unsort the list if sorted is false
        if (!sorted) {
            Collections.shuffle(lista);
        }

        return lista;
    }
}
