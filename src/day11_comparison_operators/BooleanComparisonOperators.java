package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(1000 > 500);
        System.out.println(100 < 50);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(-100 != 44);

        int a = 100;
        int b = 200;

        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println(a > b );
        System.out.println(a < b );


        boolean result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);
        
        result = 88 < 99;
        System.out.println("result = " + result);
        
        result = 10 <= 8;
        System.out.println("result = " + result);
        
        result = 10<= 10;
        System.out.println("result = " + result);
        
        result = 123 <= 124;
        System.out.println("result = " + result);
        
        result = 2 != 1;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");

        String name = "Nadir";
        boolean checkName = name == "Nadir";






    }
}
