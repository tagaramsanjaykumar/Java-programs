import java.util.*;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        // Input string
        String input = "programming";
        Map<Character, Long> characterCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >=2)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));

        //characterCount.forEach((key, value) -> System.out.println(key + ":" + value));
                for(Map.Entry<Character,Long>entry:characterCount.entrySet()){
                    Character key=entry.getKey();
                    Long value=entry.getValue();
                    System.out.println(key+":"+value);

                }


    }
}