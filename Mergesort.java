import java.util.ArrayList;

public class Mergesort {
    /**
     *  Merge sort es un método para ordenar que se basa en separar el arreglo en mitades, ordenar cada mitad y luego combinarlas
     * @param arr Arralist de enteros a ordenar
     * @param left Valor 0 o el primer valor del arreglo
     * @param right el valor máximo del arreglo, es decir, el último (arr.size() - 1)
     * 
     */
    public static void mergeSort(ArrayList<Integer> arr, int left, int right) {
        if (left < right) {
            // Encuentra el punto medio
            int mid = left + (right - left) / 2;
            // Ordena la primera y segunda mitad
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            // Combina las mitades ordenadas
            merge(arr, left, mid, right);
        }
    }
    /**
     * 
     * @param arr Arreglo a ordenar
     * @param left El valor del primer elemento del arreglo
     * @param mid  el valor del punto medio del arreglo
     * @param right el valor del último elemento del arreglo
     * 
     */
    private static void merge(ArrayList<Integer> arr, int left, int mid, int right) {
        // Crear dos arreglos temporales
        ArrayList<Integer> leftArr = new ArrayList<>(arr.subList(left, mid + 1));
        ArrayList<Integer> rightArr = new ArrayList<>(arr.subList(mid + 1, right + 1));
        // Índices iniciales de los dos arreglos
        int i = 0, j = 0, k = left;
        // Combinar los arreglos temporales
        while (i < leftArr.size() && j < rightArr.size()) {
            if (leftArr.get(i) <= rightArr.get(j)) {
                arr.set(k++, leftArr.get(i++));
            } else {
                arr.set(k++, rightArr.get(j++));
            }
        }
        // Copiar los elementos restantes de leftArr y rightArr
        while (i < leftArr.size()) {
            arr.set(k++, leftArr.get(i++));
        }
        // Copiar los elementos restantes de rightArr
        while (j < rightArr.size()) {
            arr.set(k++, rightArr.get(j++));
        }
    }

}
