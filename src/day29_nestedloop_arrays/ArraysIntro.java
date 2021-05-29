package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
       // int num; // this is a single variable
       // int[] nums;  // this is Array variable. when we see [] square bracket in front of data type we
                      // should understand that it is an array and java also understands that it is Array
        int [] nums = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        System.out.println("value at index 0 = " + nums [0]); // index 0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int [] age = new int [5];
        age [0] = 12;
        age [1] = 15;
        age [2] = 20;
        age [3] = 25;
        age [4] = 30;
        System.out.println("age at index 0 = " + age[0]); // will print 12
        System.out.println("age at index 1 = " + age[1]);
        System.out.println("age at index 2 = " + age[2]);
        System.out.println("age at index 3 = " + age[3]);
        System.out.println("age at index 4 = " + age[4]);

        System.out.println("using for loop");
        for(int i = 0; i < age.length; i ++){
            System.out.println(age[i]);

            int [] count = {12, 3, 8};
            System.out.println("using for each loop");
            for (int a : count){
                System.out.println(a);
            }
        }
    }
}
