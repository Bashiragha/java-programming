package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
            System.out.println("***WELCOME TO TD BANK ATM***");
        int secretpincode =1234;
        int inputcode = 1234;
        if (secretpincode == inputcode) {
            System.out.println("Welcome to yur account. \n you can withdraw. \n checkBalance. \n Deposit");
        }else{
            System.out.println("pincode is incorrect \n please try again");
            System.out.println("Thank you for using TD Bank ATM");
        }
    }

}
