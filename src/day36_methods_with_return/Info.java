package day36_methods_with_return;

public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("full name = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("age = " + getAge());
    }


    public static String fullName() {
        System.out.println("inside fullName method");
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge(){
        int age = 35;
        return age;

    }


}
