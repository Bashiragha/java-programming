package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) {
        int seconds = 0;
        System.out.println("start watching world's smallest cat video");

        while (seconds <= 117){
            System.out.println("watch the cat video at seconds :" + seconds);
            seconds++;
        }
        System.out.println("finish watching the video"); // out of the loop it prints independently
        System.out.println("lets starts another one");  // out of the loop
    }

    }

