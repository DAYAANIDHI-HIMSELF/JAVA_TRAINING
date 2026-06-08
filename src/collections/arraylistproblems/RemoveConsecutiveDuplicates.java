package collections.arraylistproblems;
//Given an ArrayList of integers, remove all consecutive duplicate values while keeping the order of first
//occurrences. Non-consecutive duplicates are kept.
//Input:
//Output:
//        [1, 1, 2, 2, 2, 3, 1, 1, 4]
//        [1, 2, 3, 1, 4]

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveConsecutiveDuplicates {
    void main() {
        ArrayList<Integer> cdup=new ArrayList<>(Arrays.asList(1,1,2,2,2,3,1,1,4));
        System.out.println(removeConsecutiveDuplicates(cdup));




    }
    public ArrayList<Integer> removeConsecutiveDuplicates(ArrayList<Integer> list){
        int a=0;
        int b=1;
        while (b< list.size()){
            if (list.get(a).equals(list.get(b))){
                list.remove(b);
                continue;
            }
            a++;
            b++;
        }
        return list;




    }
}
