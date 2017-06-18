package com.rubyalliance.cims.courses.sp17.datastructures.lab5;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Integer[] answer = {3, 3, 4, 5, 5, 7, 9, 9, 10, 10, 11, 19, 20, 24, 28, 29, 30, 43, 43, 63, 85};
        Integer[] x = {4, 5, 3, 63, 7, 9, 10, 43, 28, 43, 85, 20, 19, 3, 5, 10, 11, 9, 24, 29, 30};
        Integer[] copyOfx = Arrays.copyOf(x, x.length);

        ISorting<Integer> sorter = new BubbleSort<>();
        Integer[] result = sorter.sort(x);

        if (Arrays.equals(result,answer)) {
            System.out.println("com.rubyalliance.cims.courses.sp17.datastructures.lab5.BubbleSort Correct.");
        } else {
            System.err.println("com.rubyalliance.cims.courses.sp17.datastructures.lab5.BubbleSort InCorrect:");
            System.err.println(Arrays.toString(result));
        }

        if (!Arrays.equals(x,copyOfx)){
            System.err.println("Contents of x has been changed.");
        }

        sorter = new InsertionSort<>();
        result = sorter.sort(x);


        if (Arrays.equals(result,answer)) {
            System.out.println("com.rubyalliance.cims.courses.sp17.datastructures.lab5.InsertionSort Correct.");
        } else {
            System.err.println("com.rubyalliance.cims.courses.sp17.datastructures.lab5.InsertionSort InCorrect:");
            System.err.println(Arrays.toString(result));
        }
    }
}