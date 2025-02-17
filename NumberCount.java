import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class NumberCount {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,6,9,1,3,5,6,6,1,8));
        Scanner sc=new Scanner(System.in);
        var i=sc.nextInt();
        int count= (int)al.stream()
                    .filter(j->j==i)
                    .count();
        System.out.println("Count of "+i+":"+count);
    }
}
