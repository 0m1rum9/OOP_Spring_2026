
package lab.problems.problem5;


/**
 * Sort
 */
public class Sort {

    public static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static <E extends Comparable<E>> void selectionSort(E[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int pos = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[pos].compareTo(arr[j]) > 0)
                    pos = j;
            }
            swap(arr, i, pos);
        }
    }
}
