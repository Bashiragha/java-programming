package day12_Conditional_Statmement;

public class IfElseStatements {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE"); // here this one will not be printed in console because its its already true.
        }

            int count = 25;
            if (count > 30) {
                System.out.println("COUNT IS MORE THAN 30");
            } else {
                System.out.println("COUNT IS LESS THAN 30");
            }

                byte age = 25;
                if(age >= 18) {
                    System.out.println("you are eligible to Vote");
                    System.out.println("Age is greater or equal to 18");
                } else {
                    System.out.println("Not Eligible to Vote");
                    System.out.println("age is less than 18");
                }
            }
        }

