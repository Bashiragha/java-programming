package day42_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {

//      declare integer arraylist with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6, 3 ));
        System.out.println(nums);
        // loop through the list
        for (Integer num : nums){
            // check if number appears only once in the list
            if (Collections.frequency(nums, num) == 1){
                // print that number
                System.out.print(num + " ");
            }
        }
    }
}
