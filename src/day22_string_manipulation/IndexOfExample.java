package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technology = "java, html, Css, selenium, testng, maven, cucumber,maven";
        System.out.println(technology.indexOf(","));
        // first comma
        System.out.println(technology.lastIndexOf(","));
        // last comma
        // for middle one, we need to loop
        int indexOfJava = technology.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int indexOfCss= technology.indexOf("Css");
        System.out.println("Css is at index " + indexOfCss);

        int indexOfCucumber = technology.indexOf("Cucumber");
        System.out.println("Cucumber is at index " + indexOfCucumber);

        if (technology.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }



    }
}
