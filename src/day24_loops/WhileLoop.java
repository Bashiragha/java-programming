package day24_loops;

public class WhileLoop {
    public static void main(String[] args) {

        int apples = 1; // this part is before loop

        while (apples < 10) { // loop starts from here
            System.out.println("eating an apple -"  +apples);
            apples++;  // this is part is out of loop
        }
        System.out.println("no more apples"); // this part is out of loop so it will print independently no connection with loop

    }
}


