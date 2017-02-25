import java.util.Arrays;

/**
 * Created by fredf on 2/25/2017.
 */
public class QuickSort<T extends Comparable<? super T>> implements ISorting<T> {
    private T[] copyOfElements;

    @Override
    public T[] sort(T[] elements) {
        if (elements == null || elements.length == 0) {
            return elements;
        }
        this.copyOfElements = Arrays.copyOf(elements,elements.length);
        quicksort(0, elements.length - 1);
        return copyOfElements;
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        T pivot = copyOfElements[low + (high - low) / 2];
        while (i <= j) {
            while (copyOfElements[i].compareTo(pivot) < 0) {
                i++;
            }
            while (copyOfElements[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void swap(int i, int j) {
        T temp = copyOfElements[i];
        copyOfElements[i] = copyOfElements[j];
        copyOfElements[j] = temp;
    }
}
