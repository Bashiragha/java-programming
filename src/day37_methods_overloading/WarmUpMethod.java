package day37_methods_overloading;

public class WarmUpMethod {

    public static void main(String[] args) {
        loginVoid("cybertekstudent", "abc123");
        loginVoid("cybertek", "answer");
        loginVoid("", "");
        //System.out.println(loginVoid("cybertekStudent", "abc123")); // ERROR - VOID - no return value
        System.out.println(login("cybertekStudent", "abc123"));

        if (login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome to Canvas");
        } else {
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);

        if (login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        } else {
            System.out.println("Something wrong with your credentials");
        }


    }
    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (secretUserName.equalsIgnoreCase(userName) && secretPassword.equals(password)) {
            System.out.println("Login Successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        //return (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)); //shortcut and works the same
        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            return true;
        } else {
            return false;
        }

    }


}
