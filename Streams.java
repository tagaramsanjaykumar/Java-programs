import java.util.ArrayList;
import java.util.Arrays;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,4,8,12,16,23,27,21,8,2));
        System.out.println("Count of Even numbers : "+al.stream()
                .filter(i->i%2==0)
                .count());
    }
}
