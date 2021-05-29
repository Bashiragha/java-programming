package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("Cap"));  // true because Cap is somewhere in Capital one
        System.out.println(company.contains("tal"));  // true because tal is somewhere in Capital one
        System.out.println(company.contains("TA"));  // false because there is one in Capital one
        // if the name contains space give a space in command like
        System.out.println(company.contains("cap")); // false because java is case sensitive
        System.out.println(company.contains("l o")); // true because there is space between l and o and it will print the same


        if (company.contains("    ")) {
            System.out.println("multiple word company name");
        }else{
            System.out.println("single word company name");
        }
        String firstName = "ahmed";
        // check if firstName contains "a" and "e" at same time.
        if (firstName.contains ("a") && firstName.contains ("e")) {
            System.out.println("both a && e are present");
        }else{
            System.out.println("a || e not present");
        }
        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else{
            System.out.println("nether a nor i is present");
        }
        String email = "bashriagha1991@gmail.com";
        // check if email contains "@" and ends with ".com"

        if (email.contains ("@") && email.endsWith(".com")) {
            System.out.println("email is valid");
        }else{
            System.out.println("invalid email");

            if (email.toLowerCase().contains("a")) {
                System.out.println("a is present");
            }else {
                System.out.println("a is not present");
            }
             // Replace () method is String class:
            // it search ing the string and replaces with another string.

        }

    }

}
