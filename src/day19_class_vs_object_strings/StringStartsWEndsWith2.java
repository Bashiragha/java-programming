package day19_class_vs_object_strings;

public class StringStartsWEndsWith2 {
    public static void main(String[] args) {
        String Country = "Afghanistan";
        System.out.println(Country.startsWith("A"));    // true
        System.out.println(Country.endsWith("n"));     // true
        System.out.println(Country.startsWith("a"));  // false because java is case sensitive
        System.out.println(Country.endsWith("N"));   // false because case sensitive
        System.out.println(Country.startsWith("Af"));// true
        System.out.println(Country.startsWith("AF")); // false because F is lower and in print we give F capital

        if(Country.startsWith("A")) {
            System.out.println("Country Name is -" + Country);
        }else{
            if(Country.startsWith("P")){
                System.out.println("Country is not " + Country);
            }
        }

    }
}
