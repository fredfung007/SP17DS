/**
 * Created by fredf on 2/21/2017.
 */
public interface ISorting<T extends Comparable<? super T>> {
    // Return the result from sorting the input array.
    T[] sort(T[] elements);
    T[] descendingSort(T[] elements);
}
