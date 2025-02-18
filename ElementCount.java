import java.util.List;

public class ElementCount {
    public static void main(String[] args) {
        List<Integer> ls=List.of(2,4,5,5,22,12,13);
        long count1 = ls.stream()
                .count();
        System.out.println(count1);
    }
}
