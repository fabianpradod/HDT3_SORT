package src;
import java.util.ArrayList;

public class BinarySort {
    
    // Método para realizar el sort por inserción binaria
    public static void binarySort(ArrayList<Integer> lista) {
        int n = lista.size();
        
        for (int i = 1; i < n; i++) {
            int key = lista.get(i);
            int left = 0, right = i - 1;
            
            // Búsqueda binaria para encontrar la posición correcta de inserción
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (lista.get(mid) > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            // Mueve los elementos para hacer espacio para key
            lista.add(left, key);
            lista.remove(i + 1);
        }
    }
}
