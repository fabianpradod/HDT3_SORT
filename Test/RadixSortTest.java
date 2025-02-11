package Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import src.Radixsort;

public class RadixSortTest {

    // Prueba 1: Lista vacía
    @Test
    public void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        Radixsort.radixSort(list);
        assertTrue(list.isEmpty());
    }

    // Prueba 2: Lista con un solo elemento
    @Test
    public void testSingleElementList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5));
        Radixsort.radixSort(list);
        assertEquals(Arrays.asList(5), list);
    }

    // Prueba 3: Lista de números positivos
    @Test
    public void testPositiveNumbers() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(38, 27, 43, 3, 9, 82, 10));
        Radixsort.radixSort(list);
        assertEquals(Arrays.asList(3, 9, 10, 27, 38, 43, 82), list);
    }
}

