package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {

        System.out.println("are you sure you want to delete this file? ");

        char selection = 'Y';
        boolean answer;
        String result;
        if (selection == 'Y') {
            System.out.println("your file will be deleted");
            answer = true;
            result = "deleted";

        } else {
            System.out.println("answer deletion canceled");

            answer = false;
            result = "not deleted";

            System.out.println(" did file get deleted? - " + answer);

        }
    }

}
