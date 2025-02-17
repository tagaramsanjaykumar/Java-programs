//
public class Vowels {
    public static void main(String[] args) {
        String s1="Hi Welcome to India";
        String s2=s1.toLowerCase();
        int vowel_count=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u') {
                    vowel_count+=1;
            }
        }
        System.out.println("Number of vowels present in the string:"+vowel_count);
        }
}
