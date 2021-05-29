package day15_logicalops_switch_ternary;

public class NotlogicalOperator {
    public static void main(String[] args) {
        System.out.println("true = " + (!true));
        System.out.println("!false = " + (false));

        int age = 2;

        if(!(age > 7)) {

            System.out.println("Need to set in child car seat. age= " + age);
        }else{
            System.out.println("can set in normal seat. age = " + age);
            
            boolean isSmokingAllowed = false;
            if(!isSmokingAllowed){
                System.out.println("Smoking is not allowed here. Exit");
                }

            }

        }
    }

