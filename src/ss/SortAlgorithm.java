package ss;

import java.util.Comparator;

/**
 * Interface for sorting algorithms.
 *
 * @param <T> The type of elements being sorted, which should implement Comparable.
 */
public interface SortAlgorithm<T extends Comparable<T>> {
    void sort();
    int getComparisonCount();
    T[] getArrayToSort();
    void swap(int i, int j);

}
