package day25_loops;

public class printStars {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 15; stars++) {
            System.out.print("* ");
        }

        String myStars = "";
        // for loop: fill 5 stars ti nyStars variable.
        for(int stars = 1; stars <= 5; stars++) {
            // myStars = myStars +"*"
            myStars += "* ";


            System.out.println("my stars = " + myStars);
        }
        }
    }
