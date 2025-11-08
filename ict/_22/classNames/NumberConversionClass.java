package ict._22.ClassNames;

public class NumberConversionClass {
    public static void convertAll(int num) {
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexa: " + Integer.toHexString(num).toUpperCase());
    }

    public static int binaryToDecimal(String bin) {
        int res = 0;
        int i = 0;
        do {
            int bit = bin.charAt(bin.length() - 1 - i) - '0';
            res += bit * Math.pow(2, i);
            i++;
        } while (i < bin.length());
        return res;
    }
}
