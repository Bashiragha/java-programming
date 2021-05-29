package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 5));
        System.out.println(Integer.min(5, 2));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));  // first larger than second
        System.out.println(Double.compare(5, 5));  // 0 - both are equal
        System.out.println(Double.compare(5, 50)); // -1 first is smaller than second

        System.out.println(Character.isDigit('8'));  //  it is digit and will give us true
        System.out.println(Character.isDigit('V'));  // it is not digit and will give us false
        System.out.println(Character.isAlphabetic('Q')); // will give true
        System.out.println(Character.isLetter('r')); // will give us true
        System.out.println(Character.isUpperCase('A'));  // will give us true A is upperCase

        char letter = 'A';
        if(Character.isUpperCase(letter)) {
            System.out.println("it is upperCase");

        }
        String word = "JaVa is FuN";
        for (int i = 0; i< word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);
    }
}
