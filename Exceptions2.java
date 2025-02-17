import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int result=a/b;
        int result2=a+b;
        System.out.println("division:"+result);
        System.out.println("Sum:"+result2);
    }
}
