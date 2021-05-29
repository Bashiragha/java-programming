package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply;
        if (hourlyRate > 45) {
            reply = "accept";
        } else {
            reply = "reject";

            reply = (hourlyRate > 45) ? "accept" : "reject";
        }
        System.out.println("reply = " + reply);
        String todayClass = "Java";
        String teacher = (todayClass.equals("Java")) ? "Murodil" : "Nadir";
        System.out.println("today's teacher = " + teacher);

        boolean isEligibleToDrive = false;
        String driving = isEligibleToDrive ? "Yes has DL" : "No doesnt have DL";
        System.out.println("driving = " + driving);

        }
    }


