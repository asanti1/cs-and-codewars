package WhichAreIn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kata {
    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> response = new HashSet<>();
        for (String value : array1) {
            for (String s : array2) {
                if (s.contains(value)) {
                    response.add(value);
                }
            }
        }
        if (response.isEmpty()) return new String[]{};
        Object[] namesArray = response.toArray();
        String[] finalAnswer = new String[response.size()];
        for (int i = 0; i < namesArray.length; i++) {
            finalAnswer[i] = (String) namesArray[i];
        }
        Arrays.sort(finalAnswer);
        return finalAnswer;
    }
}

/*
BEST
public class WhichAreIn {

	public static String[] inArray(String[] array1, String[] array2) {
    return Arrays.stream(array1)
      .filter(str ->
        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
      .distinct()
      .sorted()
      .toArray(String[]::new);
	}
}
 */
