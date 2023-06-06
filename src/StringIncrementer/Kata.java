package StringIncrementer;

import java.math.BigInteger;

public class Kata {
    public static String incrementString(String str) {
        if (str.isEmpty()) {
            return "1";
        }

        int numberStartIndex = str.length() - 1;
        while (numberStartIndex >= 0 && Character.isDigit(str.charAt(numberStartIndex))) {
            numberStartIndex--;
        }
        numberStartIndex++;

        String prefix = str.substring(0, numberStartIndex);
        String numberStr = str.substring(numberStartIndex);

        if (numberStr.isEmpty()) {
            return str + "1";
        }

        BigInteger number = new BigInteger(numberStr);
        number = number.add(BigInteger.ONE);

        String paddedNumber = number.toString();
        int numZeros = numberStr.length() - paddedNumber.length();
        if (numZeros > 0) {
            paddedNumber = String.format("%0" + numZeros + "d", 0) + paddedNumber;
        }
        return prefix + paddedNumber;
    }
}