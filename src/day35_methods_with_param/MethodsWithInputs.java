package day35_methods_with_param;

public class MethodsWithInputs {

    public static void main (String[] args){
        displayValue(1);
        displayValue(94);
        displayValue(100);
        int count = 55;
        displayValue(count);
        greatByName("saim");
        greatByName("Hozaifa");
        String name = "Hamza";
        greatByName(name);

    }
    public static void displayValue(int num) {
        System.out.println("value is " + num);


    }
    public static void greatByName(String name){
        System.out.println("Hello " +name+" how are you?");
    }
}
