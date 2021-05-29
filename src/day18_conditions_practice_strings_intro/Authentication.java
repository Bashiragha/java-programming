package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 5678;

        int ssn = 1234;
        int pin = 5679;

        if (ssn == expLast4SSN && expPinCode == pin) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");

            }

        }
    }
