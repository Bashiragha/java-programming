package day19_class_vs_object_strings;

public class StringsComparison {
    public static void main(String[] args) {

        // Equals () method - Case sensitive comparison

        String city = "Chicago";
        System.out.println(city.equals("Chicago"));  // true
        System.out.println(city.equals("chicago"));  // false
        System.out.println(city.equals ("Chicago ")); // false because of space and capital letter in start

        // EqualsIgnoreCase () method - Case Sensitive Comparison
        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase("Chicago "));
        System.out.println(city.equalsIgnoreCase("Chi cago"));



    }
}
