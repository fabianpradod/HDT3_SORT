package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import src.BinarySort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySortTest {
    // Método para probar el BinarySort
    @Test
    void testBinarySort() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        BinarySort.binarySort(lista); 

        // Revisar que la lista este ordenada
        ArrayList<Integer> esperado = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 8));
        assertEquals(esperado, lista, "La lista no está ordenada correctamente");
    }

    // Probar una lista vacía
    @Test
    void testEmptyList() {
        ArrayList<Integer> lista = new ArrayList<>();
        BinarySort.binarySort(lista);
        assertEquals(new ArrayList<>(), lista, "La lista vacía no debe cambiar");
    }

    // Prueba una lista de un solo elemento
    @Test
    void testSingleElementList() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(42));
        BinarySort.binarySort(lista);
        assertEquals(new ArrayList<>(Arrays.asList(42)), lista, "La lista con un solo elemento no debe cambiar");
    }
}
