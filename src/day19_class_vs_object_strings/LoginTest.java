package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";

        String UserName = "cybertek";
        String Password = "Abc123";

        if (expUserName.equalsIgnoreCase(UserName) && expPassword.equals(Password)) {
            System.out.println("Pass - user logged in successfully");
        } else {
            if (!expUserName.equalsIgnoreCase(UserName)) {
                System.out.println("Fail - user Name is incorrect");
            } else {
                if (!expPassword.equalsIgnoreCase(Password)) {
                    System.out.println("Fail - Password is incorrect");
                }
            }
        }
    }
}

