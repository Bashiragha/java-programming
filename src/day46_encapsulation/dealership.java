package day46_encapsulation;

public class dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        // ERROR below, model and year are PRIVATE and cannot be accessed
        // car1.model = "Nissan Altima";
        //car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println("car1 year ");
    }
}
