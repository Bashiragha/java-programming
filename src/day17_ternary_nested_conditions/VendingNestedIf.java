package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coke";
        String snackItem = "chips";

        if ( selection.equals ("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea Item is selected");

            } else {
                System.out.println("coke Item is selected");
            }
        }else if (selection.equals ("snack")) {
            System.out.println("chips option is selected");
        }else {
            System.out.println("candy option is selected");

            }
        }

    }
