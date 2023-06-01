package BuildTower;

public class Kata {
    public static String[] towerBuilder(int nFloors) {
        StringBuilder s = new StringBuilder();
        int whiteSpaces = 2 * nFloors - 2;
        int stars = 1;
        String[] finalForm = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            s.append(" ".repeat(whiteSpaces / 2));
            s.append("*".repeat(stars));
            s.append(" ".repeat(whiteSpaces / 2));
            whiteSpaces -= 2;
            stars += 2;
            finalForm[i] = String.valueOf(s);
            s = new StringBuilder();
        }
        return finalForm;
    }
}
