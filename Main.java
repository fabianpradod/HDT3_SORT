import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Tamaño de listas a utilizar
        int[] sizes = {10,100,1000,2000,3000};

        // Se guardaran las listas creadas para asegurar igualdad entre algoritmos
        ArrayList<ArrayList<Integer>> unsortedLists = new ArrayList<>();
        ArrayList<ArrayList<Integer>> sortedLists = new ArrayList<>();

        // Creacion y guardado de listas 
        for (int size : sizes) {
            unsortedLists.add(ListGenerator.lista(size, false));
            sortedLists.add(ListGenerator.lista(size, true));
        }

        // Probar los algoritmos de ordenamiento
        testAlgorithm("InsertionSort", unsortedLists, sortedLists);
        testAlgorithm("MergeSort", unsortedLists, sortedLists);
        testAlgorithm("QuickSort", unsortedLists, sortedLists);
        testAlgorithm("RadixSort", unsortedLists, sortedLists);
        testAlgorithm("BinaryInsertionSort", unsortedLists, sortedLists);
    }

    // Metodo para probar los algoritmos de ordenamiento. Toma el nombre del algoritmo y ambas Arrays de listas
    private static void testAlgorithm(String algorithm, ArrayList<ArrayList<Integer>> unsortedLists, ArrayList<ArrayList<Integer>> sortedLists) {
        System.out.println("Testing " + algorithm);

        // Itererar por cada lista para cada algoritmo
        for (int i = 0; i < unsortedLists.size(); i++) {
            int size = unsortedLists.get(i).size();

            // Clonar las listas para que el ordenamiento tenga igualdad 
            ArrayList<Integer> listToSort = new ArrayList<>(unsortedLists.get(i));
            ArrayList<Integer> sortedListToSort = new ArrayList<>(sortedLists.get(i));

            // Ordenar las listas desordenadas
            callSort(algorithm, listToSort);
            System.out.println("  Size " + size + " (Unsorted)");

            // Ordenar las listas ya ordenadas
            callSort(algorithm, sortedListToSort);
            System.out.println("  Size " + size + " (Sorted)");
        }

        System.out.println();
    }

    // Metodo que llama a los algoritmos segun el String algorithm (nombre del algoritmo de ordenamiento)
    private static void callSort(String algorithm, ArrayList<Integer> list) {
        long startTime = System.nanoTime(); // Empezar el timer
    
        switch (algorithm) {
            case "InsertionSort":
                InsertionSort.insertionSort(list);
                break;
            case "MergeSort":
                Mergesort.mergeSort(list, 0, list.size() - 1);
                break;
            case "QuickSort":
                QuickSort.quickSort(list);
                break;
            case "RadixSort":
                Radixsort.radixSort(list);
                break;
            case "BinaryInsertionSort":
                BinarySort.binarySort(list);
                break;
            default:
                throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
        }
    
        long endTime = System.nanoTime(); // Terminar el timer
        long tiempo = (endTime - startTime);
    
        System.out.println("    Tiempo: " + tiempo + "ns");
    }   
}
