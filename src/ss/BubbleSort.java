package ss;

import java.util.Comparator;

/**
 * Implements the Bubble Sort algorithm for generic types.
 *
 * @param <T> The type of elements being sorted, which should implement Comparable.
 */
public class BubbleSort<T extends Comparable<T>> implements SortAlgorithm<T> {
    private T[] arrayToSort;
    private CustomComparator<T> customComparator;
    private int comparisonCount;

    // Custom comparator
    public BubbleSort(T[] arrayToSort, Comparator<? super T> customComparator) {
    	 if (arrayToSort == null) {
             throw new IllegalArgumentException("Array to sort cannot be null");
         }
        this.arrayToSort = arrayToSort;
        this.customComparator = new CustomComparator<>(customComparator);
        this.comparisonCount = 0;
    }
    
    @Override
    public void sort() {
        int n = arrayToSort.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (compare(arrayToSort[i - 1], arrayToSort[i]) > 0) {
                    swap(i - 1, i);
                    swapped = true;
                }
            }
            n--;        
        } while (swapped);
    }

    @Override
    // Swaps two elements in the array.
    public void swap(int i, int j) {
        T temp = arrayToSort[j];
        arrayToSort[j] = arrayToSort[i];
        arrayToSort[i] = temp;
        // Increment the comparison count
        comparisonCount++;
    }

    // Compares two elements using the custom comparator.
    public int compare(T object1, T object2) {
        return customComparator.compare(object1, object2);
    }

    @Override
    // Retrieves the number of comparisons made during the sorting process.
    public int getComparisonCount() {
        return comparisonCount;
    }

    @Override
    // Retrieves the array after sorting.
    public T[] getArrayToSort() {
        return arrayToSort;
    }
}
