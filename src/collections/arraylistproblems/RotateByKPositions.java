package collections.arraylistproblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Given an ArrayList of integers and a non-negative integer k, rotate the list to the right by k positions. If k
//exceeds the list size, apply modulo.
//        Input:
//Output:
//list = [1, 2, 3, 4, 5], k = 2
//        [4, 5, 1, 2, 3]




public class RotateByKPositions {
    void main(){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(rotateRight(list,k));

    }

    public ArrayList<Integer> rotateRight(ArrayList<Integer> list, int k){
        list=reverse(list,0,list.size()-1);
        list=reverse(list,k,list.size()-1);
        list=reverse(list,0,k-1);
        return list;
    }
    public ArrayList<Integer> reverse(ArrayList<Integer> list,int start,int end){
        while (start<end){
            int t=list.get(start);
            list.set(start,list.get(end));
            list.set(end,t);
            //System.out.println(list);
            start++;
            end--;
        }
        return list;
    }

}
