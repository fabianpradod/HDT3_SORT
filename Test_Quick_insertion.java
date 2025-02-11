import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test_Quick_insertion {
    @Test
    public void testQuickSort_AlreadySorted() {
        ArrayList<Integer> lista = ListGenerator.lista(5, true);
        QuickSort.quickSort(lista);
        System.out.println("QuickSort AlreadySorted: " + lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), lista);
    }

    @Test
    public void testQuickSort_ReverseOrder() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        QuickSort.quickSort(lista);
        System.out.println("QuickSort ReverseOrder: " + lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), lista);
    }

    @Test
    public void testQuickSort_RandomOrder() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(3, 1, 4, 5, 2));
        QuickSort.quickSort(lista);
        System.out.println("QuickSort RandomOrder: " + lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), lista);
    }

    @Test
    public void testInsertionSort_AlreadySorted() {
        ArrayList<Integer> lista = ListGenerator.lista(5, true);
        InsertionSort.insertionSort(lista);
        System.out.println("InsertionSort AlreadySorted: " + lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), lista);
    }

    @Test
    public void testInsertionSort_ReverseOrder() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        InsertionSort.insertionSort(lista);
        System.out.println("InsertionSort ReverseOrder: " + lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), lista);
    }

    @Test
    public void testInsertionSort_RandomOrder() {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(3, 1, 4, 5, 2));
        InsertionSort.insertionSort(lista);
        System.out.println("InsertionSort RandomOrder: " + lista);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), lista);
    }
}