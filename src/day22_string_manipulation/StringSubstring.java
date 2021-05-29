package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        // word.substring(startIndex, endIndex) it will give us another index.

        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(8, 11));

        // substring(startIndex) - it will read from start until end.

        System.out.println(word.substring(8)); // it prints fun

        System.out.println(word.substring(5)); // it will start from 5 and will print until end.

        System.out.println(word.substring(0)); // it will print from start until end.


    }
}
