public class BinarySort {
    
    // Método para realizar el sort por inserción binaria
    public static void binarySort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int left = 0, right = i - 1;
            
            // Búsqueda binaria para encontrar la posición correcta de inserción
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            // Mueve los elementos para hacer espacio para key
            for (int j = i - 1; j >= left; j--) {
                arr[j + 1] = arr[j];
            }
            
            // Inserta key en la posición encontrada
            arr[left] = key;
        }
    }
}
