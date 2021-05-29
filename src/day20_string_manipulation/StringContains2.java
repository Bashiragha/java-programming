package day20_string_manipulation;

public class StringContains2 {
    public static void main(String[] args) {
        String Country = "Afghanistan";
        System.out.println(Country.contains("Af"));  // true
        System.out.println(Country.contains("is"));  // true
        System.out.println(Country.contains("tan")); // true
        System.out.println(Country.contains("ton")); // false because there is no O in Afghanistan.


        if(Country.contains("Afghan")) {
            System.out.println("My Country is " + Country);
        }else{
            System.out.println("My Country is not " + Country);
        }
    }
}
