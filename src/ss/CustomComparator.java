package ss;

import java.util.Comparator;

/**
 * CustomComparator is responsible for comparing two elements of type T based on a specified comparator.
 *
 * @param <T> The type of elements being compared.
 */
public class CustomComparator<T> {

    private Comparator<? super T> comparator;

    public CustomComparator(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    /**
     * Compares two elements using the specified comparator.
     *
     * @param object1 The first object to compare.
     * @param object2 The second object to compare.
     * @return A negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
     */
    public int compare(T object1, T object2) {
        return comparator.compare(object1, object2);
    }
}
