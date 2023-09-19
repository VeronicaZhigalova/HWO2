import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height in meters ");
        double height = scanner.nextDouble();
        System.out.println("Please enter your weight in kilograms");
        double weight = scanner.nextDouble();

        double BMI = weight / (height * height);
        System.out.println(BMI);

    }
}
