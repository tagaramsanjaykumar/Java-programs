import java.util.*;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5,6,8,10,11));
        ArrayList<Integer> unrepeat=new ArrayList<Integer>();
        for(int i=0;i<numbers.size();i++){
            int count=1;
            for(int j=0;j<numbers.size();j++){

                if((i!=j)&&(numbers.get(i)==numbers.get(j))){

                    count=count+1;
                }
            }

            if(count==1){
                unrepeat.add(numbers.get(i));

            }



        }
        System.out.println(unrepeat);

    }
}
