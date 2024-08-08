import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {

    @Test
    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        int[] sortedArr = {2, 7, 8, 9, 10};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(sortedArr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testNegative() {
        int[] arr = {-8, -9, -7, -10, -2};
        int[] sortedArr = {-10, -9, -8, -7, -2};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(sortedArr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testMixed() {
        int[] arr = {-8, 9, 0, -10, 2};
        int[] sortedArr = {-10, -8, 0, 2, 9};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(sortedArr, sorter.basicSelectionSort(arr));
    }

    @Test
    public void testDuplicates() {
        int[] arr = {8, 8, -7, 10, -7};
        int[] sortedArr = {-7, -7, 8, 8, 10};
        SelectionSort sorter = new SelectionSort();
        assertArrayEquals(sortedArr, sorter.basicSelectionSort(arr));
    }
}