package day23_string_manipulation_wile_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] From";
        // Hello, lets code same java;
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1, end);
        System.out.println("sender = " +sender);
    }
}
