package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "ford";
        double carPrice = 4999.0;
        if (carPrice <= budget && model.equals("Toyota")  || model.equals("Honda") || model.equals("Tesla")) {
            System.out.println("ready to purchase model =" + model + "price = " + carPrice);
        }else{
            System.out.println("not intrested in model = " + model + "carPrice ="  + carPrice);
        }

    }
}
