package day19_class_vs_object_strings;

public class StringComparison2 {
    public static void main(String[] args) {

        String Country = "Afghanistan";
        System.out.println(Country.equals("Afghanistan"));
        System.out.println(Country.equals("afghanistan"));
        System.out.println(Country.equals("Afghan"));
        System.out.println(Country.equals("Afghanistan "));

        System.out.println(Country.equalsIgnoreCase("Afghanistan"));
        System.out.println(Country.equalsIgnoreCase("Afghan"));
        System.out.println(Country.equalsIgnoreCase("Afghanistan "));
        System.out.println(Country.equalsIgnoreCase("Afghanis"));


    }
}
