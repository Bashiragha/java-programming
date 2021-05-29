package day40_arraylist;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();  // polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(35); nums.add(44); nums.add(5); nums.add(50); nums.add(6); nums.add(10);
        nums.add(12); nums.add(1);

        System.out.println("nums  = " + nums);

        nums.remove(0);
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums); // it will remove the first index

        nums.remove(new Integer(50));  // it will remove value 50 in the array list
        System.out.println("nums = " + nums); //  it will not print number 50

        // for loop - iterate through all values and print

        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));

        }

        // for each loop, and print all in same line
        for(int each: nums){
            System.out.print(each + " ");
        }



    }
}
