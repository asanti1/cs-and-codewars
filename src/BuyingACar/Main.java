package BuyingACar;


import java.util.Arrays;
import java.util.function.IntConsumer;

//https://www.codewars.com/kata/554a44516729e4d80b000012/train/java
public class Main {
    public static void main(String[] args) {
        int[] res = Kata.nbMonths(2000, 8000, 1000, 1.5);

        Arrays.stream(res).iterator().forEachRemaining((IntConsumer) System.out::println);
    }
}
