package WhichAreIn;

import java.util.Arrays;
//https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
public class Main {
    public static void main(String[] args) {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };

        System.out.println(Arrays.toString(Kata.inArray(a, b)));
    }
}
