import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // Create object using constructor
        Circle c = new Circle(r);

        // OR set radius using setter
        // c.setRadius(r);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area of Circle: " + c.getArea());
    }
}
