package day09_scanner_practice;
import java.util.Scanner;


public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("##### F to c Converter program ######");
        System.out.println("Enter F  Value:");
        double FValue = input.nextDouble();
        double CValue = (FValue -32) * 5 / 9;
        System.out.println(CValue);




    }
}
