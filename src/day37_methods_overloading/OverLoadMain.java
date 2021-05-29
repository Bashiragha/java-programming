package day37_methods_overloading;

public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("Hello From Real main method");
        main(10);

        // overloading main method
        // put same name + different parameter
        // JDK does not look for this one to run

    }

    public static void main(int num){
        System.out.println("num = " + num);

    }
}
