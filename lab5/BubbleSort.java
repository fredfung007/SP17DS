package com.rubyalliance.cims.courses.sp17.datastructures.lab5;

import java.util.Arrays;

/**
 * Created by fredf on 2/21/2017.
 */
public class BubbleSort<T extends Comparable<? super T>> implements ISorting<T> {

    @Override
    public T[] sort(T[] elements) {
        T[] copy = Arrays.copyOf(elements, elements.length);
        boolean flag = true;
        T temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < copy.length - 1; i++) {
                if (copy[i].compareTo(copy[i + 1]) > 0) {
                    temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return copy;
    }

    @Override
    public T[] descendingSort(T[] elements) {
        T[] copy = Arrays.copyOf(elements, elements.length);
        boolean flag = true;
        T temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < copy.length - 1; i++) {
                if (copy[i].compareTo(copy[i + 1]) < 0) {
                    temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return copy;
    }
}
