package day23_string_manipulation_wile_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 6 ){
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 3){
            System.out.println("apples = " + apples);
            apples++;
        }
        System.out.println("apples = " + apples);

        // infinite loop
        while (true){
            System.out.println("hello world");

        }
    }
}