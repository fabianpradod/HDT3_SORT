package src;
import java.util.ArrayList;

public class QuickSort {
    public static void quickSort(ArrayList<Integer> lista) {
        if (lista == null || lista.size() <= 1) {
            return;
        }
        quickSort(lista, 0, lista.size() - 1);
    }
    //Metodo que hace la recursión, diviendo la lista en otras listas
    private static void quickSort(ArrayList<Integer> lista, int low, int high) {
        if (low < high) {
            int pi = partition(lista, low, high);
            quickSort(lista, low, pi - 1);
            quickSort(lista, pi + 1, high);
        }
    }

    //Ordena la lista según el pivote, con elementos que sean menores que el a la izquierda y mayores a laderecha.
    private static int partition(ArrayList<Integer> lista, int low, int high) {
        int pivot = lista.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (lista.get(j) <= pivot) {
                i++;
                swap(lista, i, j);
            }
        }
        swap(lista, i + 1, high);
        return i + 1;
    }

    //Intercambia elementos en la lista
    private static void swap(ArrayList<Integer> lista, int i, int j) {
        int temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }

}