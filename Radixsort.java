import java.util.ArrayList;
import java.util.Collections;

public class Radixsort {
    /**
     * radixSort es un método para ordenamiento de datos en donde los números ordenan según sus dígitos.
     * @param arr ArrayList de enteros a ordenar
     * 
     */
    public static void radixSort(ArrayList<Integer> arr) {
        // Encontrar el número máximo para saber cuántos dígitos tiene
        int max = Collections.max(arr);
        // Hacer counting sort para cada dígito. En lugar de pasar el número, se pasa el exponente (1, 10, 100, etc.)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }
    /**Sirve para ordenar los datos en el ArrayList arr según el dígito especificado por exp.
     * 
     * @param arr el arreglo a ordenar
     * @param exp el exponente del dígito a ordenar
     * 
     */
    private static void countingSort(ArrayList<Integer> arr, int exp) {
        int n = arr.size(); // Tamaño del arreglo
        ArrayList<Integer> output = new ArrayList<>(Collections.nCopies(n, 0));
        int[] count = new int[10]; // Solo dígitos 0-9
        
        // Contar la cantidad de veces que aparece cada dígito
        for (int num : arr) {
            count[(num / exp) % 10]++;
        }
        // Cambiar count[i] para que contenga la posición del dígito en el arreglo ordenado
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // Construir el arreglo ordenado
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr.get(i) / exp) % 10;
            output.set(count[index] - 1, arr.get(i));
            count[index]--;
        }
        // Copiar el arreglo ordenado al arreglo original
        for (int i = 0; i < n; i++) {
            arr.set(i, output.get(i));
        }
    }

}

