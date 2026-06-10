package collections.arraylistproblems;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

//    Given an ArrayList of integers and a target integer, return true if any two distinct elements sum to the
//    target value.
//    Input:
//    Output:
//    list = [2, 7, 11, 15], target = 9
//            true

    void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,7,11,15));
        System.out.println(hasPairWithSum(list,9));{

        }
    }

    public boolean hasPairWithSum(ArrayList<Integer> list, int target){
        for (int i=0;i<list.size()-1;i++){
            int v=target-list.get(i);
            for (int j=i;j< list.size();j++){
                if (v==list.get(j)){
                    return true;

                }

            }
        }
        return false;

    }

}
