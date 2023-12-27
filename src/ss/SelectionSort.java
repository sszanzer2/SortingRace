package ss;

import java.util.Comparator;

/**
 * Implements the Selection Sort algorithm for generic types.
 *
 * @param <T> The type of elements being sorted, which should implement Comparable.
 */
public class SelectionSort<T extends Comparable<T>> implements SortAlgorithm<T> {
    private T[] arrayToSort;
    private CustomComparator<T> customComparator;
    private int comparisonCount;

    public SelectionSort(T[] arrayToSort, Comparator<? super T> customComparator) {
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
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (compare(arrayToSort[j], arrayToSort[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
            // Increment the comparison count
            comparisonCount++;
        }
    }

    @Override
    // Swaps two elements in the array.
    public void swap(int i, int minIndex) {
        T temp = arrayToSort[minIndex];
        arrayToSort[minIndex] = arrayToSort[i];
        arrayToSort[i] = temp;
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
