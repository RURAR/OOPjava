public class FactorionUtil {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isFactorion(int n) {
        int org = n, s = 0;
        while (n > 0) {
            s += factorial(n % 10);
            n /= 10;
        }
        return s == org;
    }
}
