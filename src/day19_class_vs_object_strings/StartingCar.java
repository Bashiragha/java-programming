package day19_class_vs_object_strings;

public class StartingCar {
    public static void main(String[] args) {
        String expkey = "honda";
        String expcar = "pilot";

        String key = "honda";
        String car = "pilot";

        if (expkey.equalsIgnoreCase(key) && expcar.equals(car)) {
            System.out.println("starting - key and car are the same");
        } else {
            if (!expkey.equalsIgnoreCase(key)) {
                System.out.println("not starting key is not the same");
            } else {
                if (!expcar.equalsIgnoreCase(car)) {
                    System.out.println("fail -  key is not matching");
                }
            }
        }
    }
}
