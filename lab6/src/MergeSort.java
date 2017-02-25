import java.util.Arrays;

/**
 * Created by fredf on 2/25/2017.
 */
public class MergeSort<T extends Comparable<? super T>> implements ISorting<T> {
    private T[] numbers;

    @Override
    public T[] sort(T[] elements) {
        this.numbers = Arrays.copyOf(elements, elements.length);
        mergesort(0, elements.length - 1);
        return this.numbers;
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        T[] helper = Arrays.copyOf(numbers, numbers.length);
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i].compareTo(helper[j]) <= 0) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
