
public class Lambda2 {
    public static void main(String[] args) {
        WordCount w2=(String s1)->{
            int count=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)== WordCount.vowel1||s1.charAt(i)==WordCount.vowel2||s1.charAt(i)==WordCount.vowel3||s1.charAt(i)==WordCount.vowel4||s1.charAt(i)==WordCount.vowel5){
                    count+=1;
                }
            }
            return count;
        };
        System.out.println( w2.getCount("Hello Welcome to world".toLowerCase()));
    }
}
interface WordCount{

    public static final char vowel1='a';
    public static final char vowel2='e';
    public static final char vowel3='i';
    public static final char vowel4='o';
    public static final char vowel5='u';
    public int getCount(String s);

}



