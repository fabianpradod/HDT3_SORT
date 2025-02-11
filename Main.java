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
        testAlgorithm("BinarySort", unsortedLists, sortedLists);
    }

    // Metodo para probar los algoritmos de ordenamiento. Toma el nombre del algoritmo y ambas Arrays de listas
    private static void testAlgorithm(String algorithm, ArrayList<ArrayList<Integer>> unsortedLists, ArrayList<ArrayList<Integer>> sortedLists) {
        System.out.println("Probando " + algorithm);

        // Itererar por cada lista para cada algoritmo
        for (int i = 0; i < unsortedLists.size(); i++) {
            int size = unsortedLists.get(i).size();

            // Clonar las listas para que el ordenamiento tenga igualdad 
            ArrayList<Integer> listToSort = new ArrayList<>(unsortedLists.get(i));
            ArrayList<Integer> sortedListToSort = new ArrayList<>(sortedLists.get(i));

            // Ordenar las listas desordenadas
            System.out.println("Tamaño " + size + " (Desordenado)");
            callSort(algorithm, listToSort);
            

            // Ordenar las listas ya ordenadas
            System.out.println("Tamaño " + size + " (Ordenado)");
            callSort(algorithm, sortedListToSort);
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
            case "BinarySort":
                BinarySort.binarySort(list);
                break;
            default:
                break;
        }
    
        long endTime = System.nanoTime(); // Terminar el timer
        long tiempo = (endTime - startTime)/1000;
    
        System.out.println("    Tiempo: " + tiempo + " microsegundos\n");
    }   
}
