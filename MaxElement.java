import java.util.Arrays;
import java.util.TreeSet;

public class MaxElement {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(2,3,4,5,66,7,8));
        System.out.println(ts.descendingSet().stream()
                .findFirst()
        );
    }
}
