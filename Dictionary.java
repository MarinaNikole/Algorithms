package classwork22_08;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    /*
    Постройте частотный словарь букв русского (или английского) алфавита.

для решения можно использовать Array или HashMap ( на ваше усмотрение)..

Пример
text = "Привет, как дела?"
{'а': 2, 'в': 1, 'д': 1, 'е': 2,  'и': 1, 'к': 2, 'л': 1, 'п': 1, 'р': 1,  'т': 1,  'я': 1}
     */

    public static void main(String[] args) {
        String text = "The quick fox jumps over the lazy dog";
        Map<Character, Integer> frequency = dictionary(text);
        System.out.println(frequency);

    }

    public static Map<Character, Integer> dictionary(String text) {
        text = text.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(text);

        Map<Character, Integer> frequencyDict = new HashMap<>();

        while (matcher.find()) {
            char letter = matcher.group().charAt(0);
            frequencyDict.put(letter, frequencyDict.getOrDefault(letter, 0) + 1);
        }
        return frequencyDict;
    }
}
