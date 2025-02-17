import java.util.List;

public class OddCount {
    public static void main(String[] args) {
        List<Integer> li= List.of(2,4,5,6,9,11,13,17);
        li.stream()
                .filter(e->e%2!=0)
                .forEach(e-> System.out.println(e));

    }
}
