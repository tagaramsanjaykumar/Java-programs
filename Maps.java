import java.util.*;

public class Maps {
    public static void main(String[] args){
        String str1="I love India I Love my country".toLowerCase(Locale.ROOT);
        String[] arr= str1.split(" ");
       LinkedHashMap<String,Integer> mp=new LinkedHashMap<>();
       //loop to count the words which are same
        for (String s : arr) {
            int count = 0;
            for (String string : arr) {
                if (s.equalsIgnoreCase(string)) {
                    count += 1;
                }
            }
            //adding the word and its count to the map
            mp.put(s, count);
        }

        System.out.println(mp);
        }
}




