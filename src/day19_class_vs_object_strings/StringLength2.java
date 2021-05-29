package day19_class_vs_object_strings;

public class StringLength2 {
    public static void main(String[] args) {

        String country = "India";
        System.out.println(country. toUpperCase());
        System.out.println(country. length());
        System.out.println("count = " + country. length());
        System.out.println(country. toLowerCase());
        String Name = "Mina";
        System.out.println("count = " + Name.length());
        System.out.println(Name. toUpperCase());
        System.out.println(Name. toLowerCase());
        System.out.println(Name. length());

        if (Name. length() >= 4) {
            System.out.println("a valid loving Name");
        }else{
            System.out.println("is not a valid loving Name");
        }


    }
}
