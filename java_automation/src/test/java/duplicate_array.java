import java.util.HashMap;
import java.util.Map;

public class duplicate_array {

    public static void main(String[] args) {
        String a = "Hello World";
        Map<Character, Integer> charCount = new HashMap<>();
        a = a.toLowerCase();

        for (char c : a.toCharArray()) {
            if (Character.isLetter(c)) {
                if (charCount.containsKey(c)) {
                    charCount.put(c, charCount.get(c) + 1);
                } else {
                    charCount.put(c, 1);
                }

            }
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}