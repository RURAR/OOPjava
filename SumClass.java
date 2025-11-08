package ict._22.ClassNames;

public class SumClass {
    public static double sumSeries() {
        double sum = 0;
        double i = 1.0;
        do {
            sum += i;
            i -= 0.1;
        } while (i >= 0.01);
        return sum;
    }
}
