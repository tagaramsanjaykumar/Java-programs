import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        String s3 = "I visited Ongole yesterday";
        String s4 = "";
        System.out.print("Enter the character you want: ");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        //
        for (int i = 1; i < s3.length(); i++) {
            if (s3.charAt(i) == a && s3.charAt(i - 1) == ' ') {
                s4 = s3.substring(i);
                break;
            }
        }
            System.out.println("Substring: " + s4);

    }
}
