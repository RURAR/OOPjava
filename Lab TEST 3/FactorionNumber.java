import java.util.Scanner;

public class FactorionNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), u = sc.nextInt();
        boolean f = false;
        for (int i = l; i <= u; i++) {
            if (FactorionUtil.isFactorion(i)) {
                System.out.println(i);
                f = true;
            }
        }
        if (!f) System.out.println("No factorion numbers found in the given range.");
        sc.close();
    }
}
