package day12_Conditional_Statmement;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price:");
        double totalPrice =  scan.nextDouble();

        if(totalPrice >= 25.0) {
            System.out.println("Free Shipping Eligible. your order total: $" +totalPrice);
        }else {
            System.out.println("Not Eligible for Free Shipping. Your order total: $" + totalPrice);
        }

    }
}
