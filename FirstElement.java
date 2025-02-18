import java.util.List;

public class FirstElement {
    public static void main(String[] args) {
        List<Integer> ls=List.of(11,2,45,6,8,11,2);
        System.out.println( ls.stream()
                .findFirst()
        );
    }
}
