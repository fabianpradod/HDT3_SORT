import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListGenerator {
    public static List<Integer> lista(int size, boolean sorted) {
        List<Integer> lista = new ArrayList<>();
        
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
