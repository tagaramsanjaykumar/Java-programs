import java.util.Arrays;
import java.util.Vector;

public class Vectorss {
    public static void main(String[] args){
        int sum=0;
        //Vector declaration
        Vector<Integer> arr=new Vector<Integer>(Arrays.asList(1,2,3,4,5,6,11,7,8));
        Vector<Integer> arr2=new Vector<Integer>(Arrays.asList(1,2,3,4,7,8));
        //loop to count sum of even numbers
        for(int i:arr){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Capacity of the vector:"+arr.capacity());//To know initial capacity of vector
        System.out.println("Size of the vector:"+arr.size());//To know number of elements in the vector
        System.out.println(arr.contains(2));//To check whether specified element is present in vector or not
        arr.set(2,8);//Updating the value in vector
        System.out.println(arr);
        System.out.println(arr2.containsAll(arr));//To check whether the entire second vector is present in first vector or not
        System.out.println(arr2.indexOf(8));//To know the index of specified element
        System.out.println(arr2.remove(8));//To remove the element at specified index
        System.out.println(arr2);
        System.out.println("Sum of even numbers in the vector:"+sum);
    }
}
