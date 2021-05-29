package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list ="cat,car,cat,red car";
        for (int i = 0; i < list.length()-2; i++){
            System.out.println(list.substring(i, i + 3));
        }
        // using substring print first 3 letters
        System.out.println(list.substring(0, 3));
        System.out.println(list.substring(1, 4));
        System.out.println(list.substring(2, 5));
        System.out.println(list.substring(3, 6));
        System.out.println(list.substring(4, 7));
        System.out.println(list.substring(5, 8));
    }
}
