import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a feet value: ");
        double feet = input.nextDouble();

        double meter = feet/0.305;

        System.out.println(feet + " feet is " + meter + "meters");
      
        input.close();

    }
    
}
