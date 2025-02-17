import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> ls=List.of(2,4,22,45,68,102,107,23,24);
        System.out.println(ls.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList())
        );
    }
}
