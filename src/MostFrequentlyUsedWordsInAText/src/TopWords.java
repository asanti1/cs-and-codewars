package MostFrequentlyUsedWordsInAText.src;

import java.util.*;
import java.util.stream.Collectors;

public class TopWords {
    private HashMap<String, Integer> words;

    public static List<String> top3(String s) {
        String[] words = s.trim().toLowerCase().split("\\s+");


        List<String> cleansedWords = Arrays.stream(words)
                .map(word -> word.replaceAll("[^a-zA-Z' ]", " "))
                .flatMap(word -> Arrays.stream(word.split("\\s+")))
                .filter(word -> !word.isEmpty() && !word.matches("\\W+")).toList();

        if (cleansedWords.isEmpty()) return Collections.emptyList();

        Map<String, Long> wordFrequency = cleansedWords.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        if (wordFrequency.size() <= 3) {
            return wordFrequency.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
        } else {
            return wordFrequency.entrySet().stream()
                    .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                    .limit(3)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
        }
    }
}

