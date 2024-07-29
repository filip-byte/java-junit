import java.util.Locale;

public class StringManipulator {
    public String reverseString(String input) {

        char[] reversedString = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            reversedString[i] = input.charAt(input.length() - i - 1);
        }

        return String.valueOf(reversedString);
    }

    public boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)

        input = input.toLowerCase(Locale.ROOT);

        if (input.isEmpty()) return false;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() -i -1 )){
                return false;
            }

        }

        return true;
    }
}