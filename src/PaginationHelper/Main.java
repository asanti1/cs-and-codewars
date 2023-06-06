package PaginationHelper;

import java.util.Arrays;

//https://www.codewars.com/kata/515bb423de843ea99400000a/train/java
public class Main {
    public static void main(String[] args) {
        Kata<Integer> helper = new Kata<>(Arrays.asList(1,2,3,4), 1);
        System.out.println(helper.pageItemCount(3)); // should == -1
    }
}
