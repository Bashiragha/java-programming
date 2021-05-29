package day39_wrapper_classes;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        // auto-boxing
        int num1 = 500;   // this primitive data type
        Integer num2 = num1;  // this is Wrapper class to which we convert primitive
        Integer num3 = 234;  // 234 it self is primitives once assign to  num3 now it is
        // wrapper class and is object

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // Un-Boxing
        Double d1 = new Double(100.5); // here its a Wrapper class and is object type
        double d2 = d1;                     // here it is converted back to primitive
        double d3 = new Double(345.3);

        // Note: converting primitives to wrapper class is called Auto boxing and
        // and converting wrapper class back to primitives is called Un-boxing

        float f1 = 22;
        Float f2 = f1;
        System.out.println(f2);

        char letter = 'j';    // Auto-Boxing
        Character letter2 = letter;

        Character l1 = 'v';
        char l2 = l1;

        System.out.println(l2);
        





    }
}
