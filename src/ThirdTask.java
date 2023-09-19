import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of seconds ");
        int userSeconds = scanner.nextInt();

//        In one hour 60 minutes or 3600 seconds

        int hours =  userSeconds / 3600 ;
        int remainingTime = userSeconds % 3600;
        int minutes = remainingTime / 60;
        int seconds = remainingTime % 60;

        System.out.println(("Time: " + hours + ":" +minutes + ":" + seconds));

    }
}
