
package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java | python | selenium | html";
        String[] wordsArray = words.split (",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);

        for(String each : wordsArray) {
            System.out.println(each);
        }
        String sentence = "today I am coding java array";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println(wordsInSentence[0]);
        System.out.println(sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = " + wordsInSentence.length);

        for (String each : wordsArray){
            System.out.println(each);
        }



    }
}
