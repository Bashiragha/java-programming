package day30_arrays;

public class StudentArrays {
    public static void main(String[] args) {
        String [] student1 = new String[5];
        student1[0] = "1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "5718352533";

        String[] student2 = {"MK4421", "Mike", "Bloomberg" , "B22" , "5718352532"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student mobile num = " + student1[4]);

        System.out.println("student data length" + student1.length);

        // check if student1 data array contains 5 items.
        // true: pass: data array has correct length.
        // false: fail: data array has incorrect length

        /** check if student1 and student2 arrays have same number of data
         * True: Pass : data arrays length match
         * False: Fail: data arrays length mismatch
         */

        if (student1.length == 5) {
            System.out.println("pass: data array has correct length");
        }else{
            System.out.println("Fail: data array has incorrect length");


            if (student1.length == student2.length) {
                System.out.println("student1 and student2 has the same length");
            }else{
                System.out.println("student1 and student does not have the same length");

               // /** read from array and print the first and last name upper case.

                                // "adam" to "ADAM"
                System.out.println(student1[1].toUpperCase() + " " +student1[2].toUpperCase());

                String mobileNum = student1[4];
                System.out.println(mobileNum.length());
                System.out.println(mobileNum.startsWith("571"));

            }
        }




    }
}
