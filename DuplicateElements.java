import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> ls=List.of(2,3,33,33,21,2,5,6,3,8,21);
        ls.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream().filter(entry->entry.getValue()>1)
                .forEach(entry-> System.out.println(entry.getKey()));

    }
}
