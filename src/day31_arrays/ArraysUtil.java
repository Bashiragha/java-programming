package day31_arrays;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {

        // sort array method
        // it will sort the array in ascending (small to large) order like A to Z

        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};

        // print all nums in same line
        System.out.println(Arrays.toString(nums));

        // sort nums
        Arrays.sort(nums);  // will print by sort in ascending order from lower to higher number
        System.out.println(Arrays.toString(nums));
        System.out.println("min value = " + nums [0]);
        System.out.println("max value = " + nums[nums.length -1]);

        String [] words = {"java", "c#", "c++", "kotlin", "python"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(",", words) + "]");

        // sort words alphabetic and Ascii order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        // sorting words in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

        // sorting algorithm types java
        // insertion sort, selection sort, Buble sort, shell sort, quick sort, linier sort etc
        // Arrays.binarySearch() ---> this method/ function helps search in array for a value
        // Arrays .binarySearch(item, ArrayName);
                         //  0   1   2     3
        // int [] nums = {33, 55, 123, 400};

        // Arrays.binarySearch(55, nums); ==> 1
        // Arrays.binarySearch(400, nums); ==> 3
        // Arrays.binarySearch(40, nums); ==> -1, -3
        // Arrays.binarySearch(300, nums); ==> ??
        // PRE-REQUISITE
        // PRE-CONDITION
    }
}
