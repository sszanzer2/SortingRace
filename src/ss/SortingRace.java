package ss;

import java.util.Arrays;
import java.util.Comparator;

public class SortingRace {
    public static void main(String[] args) {
        // Example with BubbleSort integer
        BubbleSort<Integer> integerBubbleSort = new BubbleSort<>(new Integer[]{3,1, 4, 1, 5, 9, 2, 6, 5, 3, 5}, Comparator.naturalOrder());
        integerBubbleSort.sort();
        displayResults("BubbleSort (Integer)", integerBubbleSort);

        // Example with BubbleSort string
        BubbleSort<String> strBubbleSort = new BubbleSort<>(new String[]{"Chava", "Shana", "Malya", "Noami", "Tehila", "Faigy", "Aliza" }, Comparator.naturalOrder());
        strBubbleSort.sort();
        displayResults("BubbleSort (String)", strBubbleSort);

        // Example with SelectionSort integer
        SelectionSort<Integer> integerSelectionSort = new SelectionSort<>(new Integer[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5}, Comparator.naturalOrder());
        integerSelectionSort.sort();
        displayResults("SelectionSort (Integer)", integerSelectionSort);
        
        // Example with SelectionSort String
        SelectionSort<String> strSelectionSort = new SelectionSort<>(new String[]{"Chava", "Shana", "Malya", "Noami", "Tehila", "Faigy", "Aliza"}, Comparator.naturalOrder());
        strSelectionSort.sort();
        displayResults("SelectionSort (String)", strSelectionSort);
    }

    private static <T> void displayResults(String algorithm, T sorter) {
        if (sorter instanceof BubbleSort<?>) {
            BubbleSort<?> bubbleSort = (BubbleSort<?>) sorter;
            System.out.println(algorithm + " sorted array: " + Arrays.toString(bubbleSort.getArrayToSort()));
            System.out.println(algorithm + " comparison count: " + bubbleSort.getComparisonCount());
        } else if (sorter instanceof SelectionSort<?>) {
            SelectionSort<?> selectionSort = (SelectionSort<?>) sorter;
            System.out.println(algorithm + " sorted array: " + Arrays.toString(selectionSort.getArrayToSort()));
            System.out.println(algorithm + " comparison count: " + selectionSort.getComparisonCount());
        }
        System.out.println();
    }
}
