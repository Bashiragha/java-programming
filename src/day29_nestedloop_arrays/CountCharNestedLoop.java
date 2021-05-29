package day29_nestedloop_arrays;

public class CountCharNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for(int outer = 0; outer < word.length();outer++){
            for(int inner = 0; inner < word.length(); inner++){
                System.out.println(word.charAt(inner));
                if (word.charAt(outer) == word.charAt(inner)){
                }
            }
        }
    }
}
