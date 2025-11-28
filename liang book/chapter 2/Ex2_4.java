import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value in pounds: ");
        double pounds = input.nextDouble();

        double kilogram = pounds/0.454;

        System.out.println(pounds + " Pound(s) is corresponding to " + kilogram + " kilogram(s)");


    }
}
