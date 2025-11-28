import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please provide a number between 0 and 1000: ");
        int givenNumber = input.nextInt();

        int lastDigit = givenNumber % 10;
        int middleDigit = (givenNumber/ 10)% 10;
        int firstDigit = givenNumber/ 100;

        System.out.println("The sum of the digits are: " + (lastDigit+middleDigit+firstDigit));

    }
}
