import java.util.ArrayList;
import java.util.Map;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        ArrayList<String> listOfLongestWords = new ArrayList<>();
        String cleanedText = text.replaceAll("[\\p{Punct}]", "");
        String[] splitedText = cleanedText.split("\\s+");
        int longestWordLength=0;
        if(splitedText.length > 1) {
            for (int i = 0; i < splitedText.length - 1; i++) {
                if (splitedText[i].length() > splitedText[i + 1].length()) {
                    longestWordLength = splitedText[i].length();
                } else {
                    longestWordLength = splitedText[i + 1].length();
                }
            }
            for (int j = 0; j < splitedText.length; j++) {
                if (splitedText[j].length() == longestWordLength) {
                    listOfLongestWords.add(splitedText[j]);
                }
            }
            return listOfLongestWords.toArray(new String[listOfLongestWords.size()]);
        }
        return new String[]{text};
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        return null;
    }
}