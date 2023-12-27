package ss;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class SortingTest {

	@Test
	public void testIntegerBubbleSort() {
		Integer[] array = {2,1,5,3,4};
		BubbleSort<Integer> bubbleSort = new BubbleSort<>(array, Comparator.naturalOrder());
		bubbleSort.sort();
		Integer[] expected= {1,2,3,4,5};
		assertArrayEquals(expected, bubbleSort.getArrayToSort());
		assertEquals(3,  bubbleSort.getComparisonCount());
	}
	
	@Test
	public void testStringBubbleSort() {
		String[] array = {"B", "D", "A", "C"};
		BubbleSort<String> bubbleSort = new BubbleSort<>(array, Comparator.naturalOrder());
		bubbleSort.sort();
		String[] expected= {"A", "B", "C", "D"};
		assertArrayEquals(expected, bubbleSort.getArrayToSort());
		assertEquals(3, bubbleSort.getComparisonCount());
	}
	
	@Test
	public void testIntegerSelectionSort() {
		Integer[] array = {2,1,5,3,4};
		SelectionSort<Integer> selectionSort = new SelectionSort<>(array, Comparator.naturalOrder());
		selectionSort.sort();
		Integer[] expected= {1,2,3,4,5};
		assertArrayEquals(expected, selectionSort.getArrayToSort());
		assertEquals(4,selectionSort.getComparisonCount());
	}
	
	@Test
	public void testStringSelectionSort() {
		String[] array = {"B", "D", "A", "C"};
		SelectionSort<String> selectionSort = new SelectionSort<>(array, Comparator.naturalOrder());
		selectionSort.sort();
		String[] expected= {"A", "B", "C", "D"};
		assertArrayEquals(expected, selectionSort.getArrayToSort());
		assertEquals(3, selectionSort.getComparisonCount());
	}

}
