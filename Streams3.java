import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Streams3 {
    public static void main(String[] args) {
        String str = "Hello Gurpreet";
        char input = 'u';
        ArrayList<char[]> al=new ArrayList<>(Arrays.asList(str.toCharArray()));
        al.stream()
                //.forEach(i->str.charAt(i))
                .filter(value -> value.equals(input))
                .forEach(val -> System.out.println("My Answer:" + val));


    }

}
