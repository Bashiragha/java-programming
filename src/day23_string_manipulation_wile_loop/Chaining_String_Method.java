package day23_string_manipulation_wile_loop;

public class Chaining_String_Method {
    public static void main(String[] args) {
        String word = "wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());

        // remove spaces first then print everything uppercase.

        System.out.println(word.replace(" ", "").toUpperCase());

        // selenium.findElement(By.id("hi)).click();

        String capital= "KaBuL";
        System.out.println(capital.substring(0,1).toUpperCase() + capital.substring(1).toLowerCase());
        System.out.println("capital = " + capital);


    }
}
