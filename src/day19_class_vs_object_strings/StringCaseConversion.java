package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String Word = "CyberTek";
        String sentence = "1 2 3 JAVA IS FUN";
        System.out.println(Word);
        // Convert Word to all lower case.
        System.out.println(Word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        String wordInLcase = Word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        // change word to all lowercase letters. and assign back







        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in UpperCase  = " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        // change variable company "Amazon" to "AMAZON"

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}
