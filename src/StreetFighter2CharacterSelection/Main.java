package StreetFighter2CharacterSelection;


//https://www.codewars.com/kata/5853213063adbd1b9b0000be/train/java
public class Main {
    public static void main(String[] args) {
        String[][] fighters = new String[][]{
                new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
        };
        String[] movesFewMoves = new String[]{"up", "left", "right", "left", "left"};
        String[] test = Kata.streetFighterSelection(fighters, new int[]{0, 0}, movesFewMoves);
        for (String s : test) {
            System.out.println(s);
        }
    }
}
