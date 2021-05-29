package day12_Conditional_Statmement;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';

        System.out.println(letter1 == letter2);  // it will give a result wrong or false.
        System.out.println(letter1 <= letter2);   // it will give right or true because J is greater than A.
        System.out.println(letter1 >= letter2);  // the answer will be wrong or false because A is smaller than J.

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("did you pass the exam ? - " + pass);

    }
}
