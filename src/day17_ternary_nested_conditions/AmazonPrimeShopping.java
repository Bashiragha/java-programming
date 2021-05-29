package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double Price = 45;
        boolean isPrimeMember = true;
        if(isPrimeMember) {
            System.out.println("Eligible for 2 days free shipping ");
        }else{
            if(Price >= 25.0) {
                System.out.println("Eligible for regular free shipping");
            }else{
                System.out.println("Not Eligible for free shipping");
            }
        }
    }
}
