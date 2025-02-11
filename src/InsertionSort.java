package src;
import java.util.ArrayList;

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> lista) {
        if (lista == null || lista.size() <= 1) {
            return;
        }

        for (int i = 1; i < lista.size(); i++) {
            int key = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j) > key) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, key);
        }
    }
}

