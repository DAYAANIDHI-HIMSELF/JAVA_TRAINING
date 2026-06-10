package collections.arraylistproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
//    Given an ArrayList of integers, move all zero values to the end while maintaining the relative order of all
//    non-zero elements. Minimise write operations.
//            Input:
//    Output:
//            [0, 1, 0, 3, 12]
//            [1, 3, 12, 0, 0]


    void main() {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(0,1,0,3,12));
        moveZerosToEnd(list);

    }


    public void moveZerosToEnd(ArrayList<Integer> list){
        int i=0;
        int j=0;
        while (j<list.size()){
            if (list.get(j)!=0){
                int t=list.get(i);
                list.set(i,list.get(j));
                list.set(j,t);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        System.out.println(list);


    }

}
