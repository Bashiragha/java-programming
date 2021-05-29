package day19_class_vs_object_strings;

public class StringStarstWEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));  // true
        System.out.println(word.startsWith("in")); // true
        System.out.println(word.startsWith("intellij")); // true
        System.out.println(word.startsWith ("intellij idea"));  // true
        System.out.println(word.startsWith("j"));   // false
        System.out.println(word.startsWith("Int")); // false because case sensetive
        System.out.println(word.endsWith("idea"));   // true
        System.out.println(word.endsWith("a"));    // true


        String name = "Irena";
        if (name.endsWith("a")){
            System.out.println("may be it's a female name");

            String firstName = "Dr.Nadir";
            if (firstName.startsWith("Mr.")) {
                System.out.println("Man");
            }else if (firstName.startsWith("Dr.")) {
                System.out.println("Doctor");

            }else if (firstName.startsWith("Mrs")) {
                System.out.println("Woman");
            }else if (firstName.startsWith("Ms")) {
                System.out.println("Single woman");
            }else if(firstName.startsWith("Sr")) {
                System.out.println("Senior");
            }else {
                System.out.println("normal name");

                String url = "https://www.stackoverflow.com";

                if(url.endsWith("ru")) {
                    System.out.println("commercial website");
                }else if (url.endsWith("uv")) {
                    System.out.println("sports website");
                }else if(url.endsWith("RN")) {
                    System.out.println("Russian website");
                }else if(url.endsWith("gov")) {
                    System.out.println("Government website");
                }else {
                    System.out.println("Educational website");

                }




            }

        }
    }
}
