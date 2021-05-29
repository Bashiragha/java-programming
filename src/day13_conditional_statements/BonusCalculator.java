package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {

        double bonus = 0.0;
        double salesAmount = 2000.35;

        if(salesAmount <= 2000){
            System.out.println("GOOD JOB YOU QUALIFIED FOR BONUS");

        } else{
            System.out.println("GREAT JOB YOU ARE QUALIFIED FOR FULL BONUS");
            bonus = 100.0;

            System.out.println("YOUR TOTAL BONUS = $" + bonus );

        }


    }
}
