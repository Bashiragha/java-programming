package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10 + 5); // 15
        System.out.println(10 + 5 - 3); // 12
        System.out.println(10 - 5 + 3); // 8
        System.out.println(10 - (5 + 3)); // 2

        System.out.println(2 * 3); // 6
        System.out.println(2 * 3 / 3); // 2
        System.out.println(20 / (2 * 2 )); // 5
        System.out.println(10 / 1); // if it is 10 / 0 it will give run time error / if you divide any nmber by zero it will give error

        System.out.println(2 + 5 * 3);  //17
        System.out.println((2 + 5) * 3); // 21
        System.out.println(0 / 10); // 0

        System.out.println(10 / 3); // 3 it will throw the decimal point a way
        System.out.println(5 / 2); // 2 the same above is which is also called integer division problem
        // if we need mathematical precision, never divide integers/whole numbers we should use decimal points number double or float.

        System.out.println(10.0 / 3.0);
        System.out.println(5.0 /  2.0);



    }
}
