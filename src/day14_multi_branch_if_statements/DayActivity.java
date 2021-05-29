package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "windy";
        if (weather == ("sunny")) {
            System.out.println("Go to park");

        }else if (weather == ("rainy")) {
            System.out.println("stay home, drink tea");
        }else if (weather == ("snowy")) {
            System.out.println(weather + "  - clean the car and build snowman");
        }else if (weather == ("windy")) {
            System.out.println(weather + " - lets fly kite");

        }


    }
}
