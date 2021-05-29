package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args) {
        System.out.println(10 / 3);
        System.out.println(5 / 2);

        double d1 = 12.0;
        double d2 = 5.0;
        System.out.println(d1 / d2); // 2.4

        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount); //3.333333333335

       // int  n1 = 4;
       // byte b1 = n1;
        // the above line will show error, because int is larger data type than byte. even though the value is only 4.
        // in order to make it work, we need to CAST IT.
        // now, the line (byte) n1 , will cast/convert n1 to byte. then assign the value.



    }

    }

