package StreetFighter2CharacterSelection;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        List<String> listOfMovements = new ArrayList<>();

        for (String move : moves) {
            if ((position[0] == 0) && (move.equals("up"))) {
                listOfMovements.add(fighters[position[0]][position[1]]);

            } else if (move.equals("up")) {
                position[0] = 0;
                listOfMovements.add(fighters[position[0]][position[1]]);
            }

            if ((position[0] == 1) && (move.equals("down"))) {
                listOfMovements.add(fighters[position[0]][position[1]]);
            } else if (move.equals("down")) {
                position[0] = 1;
                listOfMovements.add(fighters[position[0]][position[1]]);
            }

            if ((position[1] == 0) && (move.equals("left"))) {
                position[1] = fighters[1].length - 1;

                listOfMovements.add(fighters[position[0]][position[1]]);
            } else if (move.equals("left")) {
                position[1]--;
                listOfMovements.add(fighters[position[0]][position[1]]);
            }

            if ((position[1] == fighters[1].length - 1) && (move.equals("right"))) {
                position[1] = 0;
                listOfMovements.add(fighters[position[0]][position[1]]);
            } else if (move.equals("right")) {
                position[1]++;
                listOfMovements.add(fighters[position[0]][position[1]]);
            }
        }
        Object[] aux = listOfMovements.toArray();
        String[] finalAnswer = new String[aux.length];
        for (int i = 0; i < aux.length; i++) {
            finalAnswer[i] = (String) aux[i];
        }
        return finalAnswer;
    }
}
