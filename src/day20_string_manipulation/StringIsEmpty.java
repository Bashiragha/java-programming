package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        if (jobTitle.isEmpty()) {

                System.out.println("job Title is empty please resend it");
            }else{
            System.out.println("job title looks good");

            if(jobTitle.length() == 0) {
                System.out.println("job title is not empty");
            }else {
                System.out.println("job title is empty");

            }
            String word = " ";
            System.out.println(word.isEmpty());  // false
            System.out.println(word.length());   // true

            String veggie = " ";
            System.out.println(veggie.isEmpty());  // false

            if(!veggie.isEmpty()) {
                System.out.println("we have "  + veggie);
            }
            String word2;
            System.out.println("word2".isEmpty());  // will not initialize


            //String word = "java";
            // System.out.println(word.contains("V"));    true
            // System.out.println(word.contains("va"));   true
            // System.out.println(word.contains("Ja"));   false / because case sensitive

            }

        }

    }




