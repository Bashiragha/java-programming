package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Boston";
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not consedring - " + city);


            String teacher = "John";

            if (teacher.equals("Saim") || teacher.equals("Murodil")) {
                System.out.println("it is a java class " + teacher);
            }else if(teacher.equals ("Nadir")){
                System.out.println("Soft skills class with " + teacher);
            } else {
                System.out.println("Some other Class with " + teacher);


                String company = "WADAN";
                double salary = 100000.0;
                if (company.equals("WADAN")  || salary >= 100000.0) {
                    System.out.println("accepting offer from " + company);
                }else{
                    System.out.println("rejecting offer from " + company);
                }
            }
        }
    }
}
