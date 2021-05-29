package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "Iphone 11";
        String color = "Gray";
        double price = 699.0;
        int  storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);

        System.out.println("Brand " + brand);
        System.out.println("model " + model);
        System.out.println("color " + color);
        System.out.println("price $" + price);
        System.out.println("storage " + storage +"GB");
        System.out.println("hasCamera " + hasCamera);
    }
}
