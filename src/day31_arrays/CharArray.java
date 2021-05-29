package day31_arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'};
        for(char each : letters){
            System.out.print(each);

        }
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);
        // Convert char array into string: ------> just create a new string with char array in constructor

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length() = " + itemArray.length);
        System.out.println("item.length() = " + item.length());
        // Any string that we write in java, is a char array internally for string class.
                          //   0         1        2       3         4           5
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each + "-");
            fruitStr += each + "-";
        }
        System.out.println("\n fruitStr =" + fruitStr);

        String [] languages = { "java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages = String.join (" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);

        // join method in String:
       // String [] array >>> Single String with delimiter
        // String [] words = {"one", "two", "three"};






    }

}
