package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count (5);
        count(6);
        count(7);
        count(8);
        count(9);
        count(10);
        int num = (1111);
        count(num);
        String word = "wooden spoon";
        count(word.length());

        printAge(1991);
        printAge(1988);

        int birthYear = 2001;
        printAge(birthYear);
    }
    public static void count(int num){
        for (int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth year : " + year + "Age: " + age);
    }

}
