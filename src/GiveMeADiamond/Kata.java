package GiveMeADiamond;
//https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
public class Kata {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) return null;
        StringBuilder s = new StringBuilder();
        int whiteSpaces = n/2;
        int stars = 1;
        for (int i = 0; i < n/2 + 1  ; i++) {
            s.append(" ".repeat(whiteSpaces));
            s.append("*".repeat(stars));
            s.append("\n");
            whiteSpaces--;
            stars += 2;
        }
        whiteSpaces = 1;
        stars -= 4;
        for (int i = 0; i < n/2; i++) {
            s.append(" ".repeat(whiteSpaces));
            s.append("*".repeat(stars));
            s.append("\n");
            whiteSpaces++;
            stars -= 2;
        }

        return String.valueOf(s);
    }
}