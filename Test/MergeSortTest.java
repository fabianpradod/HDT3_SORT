package Test;
import org.junit.jupiter.api.Test;

import src.Mergesort;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortTest {

    // Prueba 1: Lista vacía
    @Test
    public void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        Mergesort.mergeSort(list, 0, list.size() - 1);
        assertTrue(list.isEmpty());
    }

    // Prueba 2: Lista con un solo elemento
    @Test
    public void testSingleElementList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5));
        Mergesort.mergeSort(list, 0, list.size() - 1);
        assertEquals(Arrays.asList(5), list);
    }

    // Prueba 3: Lista desordenada
    @Test
    public void testUnsortedList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(38, 27, 43, 3, 9, 82, 10));
        Mergesort.mergeSort(list, 0, list.size() - 1);
        assertEquals(Arrays.asList(3, 9, 10, 27, 38, 43, 82), list);
    }
}
