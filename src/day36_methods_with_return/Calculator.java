package day36_methods_with_return;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(add(5.2, 20.0));
        double sum = add(1, 3);
        System.out.println("sum = " + sum);
        System.out.println("100 + 200 = " + add(100, 200));

    }

    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
}
