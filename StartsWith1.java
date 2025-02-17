import java.util.List;
import java.util.stream.Collectors;

public class StartsWith1 {
    public static void main(String[] args) {
        List<Integer> ls=List.of(2,12,13,4,17,81,11);
        System.out.println(ls.stream()
                .filter(e->e/10==1)
                .collect(Collectors.toList())
        );
    }
}
