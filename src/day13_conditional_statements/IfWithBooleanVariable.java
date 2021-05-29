package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {

        boolean ishungry = true;

        if(ishungry == true){
            System.out.println("i am hungry will go get something to eat");
            System.out.println("Then code java");

        }else {
            System.out.println("I am not hungry, I will keep coding java");

        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = "+ isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, lets buy it");
        }else
            System.out.println("too expensive, lets keep coding java");


        boolean isRemoteJob = true;
        if(isRemoteJob != true){
            System.out.println("Sorry I am not interested");

        } else {
            System.out.println("Sure I am Interested, what is interview procedure?");
        }
        }


    }

