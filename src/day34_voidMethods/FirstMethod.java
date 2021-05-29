package day34_voidMethods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();  // 1st call the method
        displayMessage();  // 2nd call to method
        displayMessage();  // 3rd call to method
        // you can do it as many times as you want but for each time you have to creat a call method

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " - ");
            displayMessage();


        }
    }
       // First custom reusable Method
    public static void displayMessage (){
        System.out.println("hello Batch 22 Friends");

    }
}
