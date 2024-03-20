package array1;
import java.util.ArrayList;
import java.util.Collections;

//Given an array of integers A, sort the array into a wave-like array and return it. Arrange the elements into a sequence such that -
//a1 >= a2 <= a3 >= a4 <= a5.....
public class wavearray {
    public static  ArrayList<Integer> wave (ArrayList<Integer> A){

        Collections.sort(A);
        int n =A.size();

        for(int i=2; i<=n; i+=2){
            exch(A,i-2,i-1);
        }
        return A;
    }
    private static void exch(ArrayList<Integer>A ,int i, int j){
        int temp=A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);
    }
    

    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);

        ArrayList<Integer> result= wave(list);

        System.out.println("wave product: "+ result);

    }
}
