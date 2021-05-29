package day26loops;

public class WeekDays {
    public static void main(String[] args) {


        for (int d = 1; d <= 10; d++) {
            switch (d) {
                case 1:
                    System.out.println(d + " - Monday");
                    break;
                case 2:
                    System.out.println(d + " - tuesday");
                    break;
                case 3:
                    System.out.println(d + " - Wednesday");
                    break;
                case 4:
                    System.out.println(d + " - Thursday");
                    break;
                case 5:
                    System.out.println(d + " - Friday");
                    break;
                case 6:
                    System.out.println(d + " - Saturday");
                    break;
                case 7:
                    System.out.println(d + " - Sunday");
                    break;
                case 8:
                    System.out.println(d + " - No such day, its java day");


            }

        }
    }
}
