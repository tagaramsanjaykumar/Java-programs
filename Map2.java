import java.util.LinkedHashMap;
public class Map2  {
    public static void main(String[] args) {
        String str="Hello Welcome to world".toLowerCase();
        char[] ch={'a','e','i','o','u'};
        LinkedHashMap<Character,Integer> lh=new LinkedHashMap<>();
        //loop to count the vowels in the string
        for (char c : ch) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    count += 1;
                }
            }
            //Adding the vowels(key) and their count(value) to the map
            lh.put(c, count);
        }
        //printing the map
        System.out.println(lh);
    }
}
