package validation;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            Validator.checkAge(age);
            Validator.checkDept(dept);

            System.out.println("Valid Input");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();   
        }
    }
}
