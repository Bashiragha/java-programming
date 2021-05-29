package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_!@$^&*";
        Random random = new Random();

        for(int i = 1; i <= 8; i++){
            int index = random.nextInt(71);
            // need to repeat from Murodil video

           System.out.println(random.nextInt(source.length()));
        }
    }
}
