package ict._22.ClassNames;

public class MainClass {
    public static void main(String[] args) {
        CustomPrintClass.pr("Sum of series 1+0.9+...+0.01 = " + SumClass.sumSeries());

        int a = 12, b = 18;
        CustomPrintClass.pr("GCD of " + a + " and " + b + " = " + DivisorMultipleClass.gcd(a, b));
        CustomPrintClass.pr("LCM of " + a + " and " + b + " = " + DivisorMultipleClass.lcm(a, b));

        int num = 25;
        CustomPrintClass.pr("Conversions for " + num + ":");
        NumberConversionClass.convertAll(num);

        String bin = "11001";
        CustomPrintClass.pr("Binary " + bin + " to Decimal = " + NumberConversionClass.binaryToDecimal(bin));
    }
}
