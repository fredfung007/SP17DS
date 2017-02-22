import java.util.Arrays;

/**
 * Created by fredf on 2/21/2017.
 */
public class InsertionSort<T extends Comparable<? super T>> implements ISorting<T> {

    @Override
    public T[] sort(T[] elements) {
        T[] copy = Arrays.copyOf(elements, elements.length);
        int n = copy.length;
        for (int j = 1; j < n; j++) {
            T key = copy[j];
            int i = j - 1;
            while ((i > -1) && (copy[i].compareTo(key) > 0)) {
                copy[i + 1] = copy[i];
                i--;
            }
            copy[i + 1] = key;
        }
        return copy;
    }

    @Override
    public T[] descendingSort(T[] elements) {
        T[] copy = Arrays.copyOf(elements, elements.length);
        int n = copy.length;
        for (int j = 1; j < n; j++) {
            T key = copy[j];
            int i = j - 1;
            while ((i > -1) && (copy[i].compareTo(key) < 0)) {
                copy[i + 1] = copy[i];
                i--;
            }
            copy[i + 1] = key;
        }
        return copy;
    }
}
