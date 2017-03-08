/**
 * Created by fredf on 3/7/2017.
 */

/*
 * Please refrain from changing this file.
 * DO NOT CHANGE THIS FILE.
 * DO NOT USE: java.util.Arrays.binarySearch;
 */
public class Program {

    public static void main(String[] args){
        int[] x = {3, 3, 4, 5, 5, 7, 9, 9, 10, 10, 11, 19, 20, 24, 28, 29, 30, 43, 43, 63, 85};
        // IF target can be found.
        if (RecursiveBinarySearch.binarySearch(x, 20) != 12){
            System.err.println("Binary Search Incorrect");
        }
        // IF target can not be found.
        if (RecursiveBinarySearch.binarySearch(x, 21) != -1){
            System.err.println();
        }
    }
}
