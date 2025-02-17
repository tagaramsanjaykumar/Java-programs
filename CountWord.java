import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CountWord {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "Banana", "fruit", "Mango", "Orange","Avacado");
        char ch='a';


//        fruits.stream()
//                .map(String::toUpperCase)  // Convert each element to uppercase
//                .forEach(e -> System.out.println(e));   // Print each element
        fruits.stream()
                .map(e->e.toLowerCase())
                .filter(e->e.startsWith(String.valueOf(ch)))
                .forEach(System.out::println);
    }
}
