package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " + words [0]);
        System.out.println("2nd word = " + words [1]);
        System.out.println("3rd word = " + words [2]);

        for (String w : words){
            System.out.println(w);
        }

        String googleResult = "about 1,810,0 00 results (0.68 seconds)";
        String[] word = googleResult.split(" ");
        System.out.println("Count = " + word[1]);
        System.out.println("Seconds = " + word[4]);



    }
}
