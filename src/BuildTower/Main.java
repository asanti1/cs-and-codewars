package BuildTower;

/*
https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.
For example, a tower with 3 floors looks like this:
[
  "  *  ",
  " *** ",
  "*****"
]
And a tower with 6 floors looks like this:
[
  "     *     ",
  "    ***    ",
  "   *****   ",
  "  *******  ",
  " ********* ",
  "***********"
]
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    String[] s = Kata.towerBuilder(6);
        for (String value : s) {
            System.out.println(value);
        }
    }
}
