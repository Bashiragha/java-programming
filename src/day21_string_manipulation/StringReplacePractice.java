package day21_string_manipulation;

public class StringReplacePractice {
    public static void main(String[] args) {
        String word ="github";
        System.out.println(word.toUpperCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub" , "lab"));
        System.out.println("word = " + word);
        word = word.replace("hub" , "lab");
        System.out.println("word = " + word);

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" " , " ");
        System.out.println("withnoSpace = " + withNoSpace);
        sentence = sentence.replace("java" , "selenium").replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 5,684,813L results for java book";
        result = result.replace("1-48 of over " ,"")
                .replace("," , "")
                .replace(" result for java book", "");
        System.out.println("result = " + result);


        }

    }


