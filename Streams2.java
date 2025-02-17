import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {
    public static void main(String[] args) {
        //ArrayList<Integer> al= new ArrayList<>( List.of(2,3,4,4,6,3,20,8,20,12));
        List<Integer> al= List.of(2,3,4,4,6,3,20,8,20,12);
        //counting even numbers in the stream
//        al.stream()
//                .filter(e->e%2==0)
//                .sorted()
//                .forEach(e->so);

      //to print sum of values in the list
//        System.out.println(al.stream()
//                 .reduce(0,(e,carry)->e+carry)
//         );


//        al.stream()
//                .filter(e->e<20)
//                .forEach(System.out::println);


        //Squaring all the numbers in the list
//        List<Integer> integers=al.stream()
//                .map(e->e*e)
//                .collect(Collectors.toList());
//        System.out.println(integers);



        System.out.println(al.stream()
                .mapToInt(e->e.intValue())
                .average()
        );

//        HashSet<Integer> st= (HashSet<Integer>) al.stream()
//                .collect(Collectors.toSet());
//        System.out.println(st);


    }
}
