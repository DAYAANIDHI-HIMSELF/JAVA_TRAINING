package collections.arraylistproblems;
import java.util.ArrayList;
import java.util.Arrays;

//3. Leaders in an Array
//An element is a leader if it is strictly greater than all elements to its right. The rightmost element is
//always a leader. Return all leaders in left-to-right order.
//Input:[16, 17, 4, 3, 5, 2]
//Output:[17, 5, 2]


public class LeadersInAnArray {


    void main(){
        ArrayList<Integer> arl= new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        System.out.println(findLeaders(arl));
    }


    public ArrayList<Integer> findLeaders(ArrayList<Integer> list){
        int max=list.getLast();
        int end=list.size()-2;
        ArrayList<Integer> leaders=new ArrayList<>();
        leaders.add(max);
        while (end>=0){
            if (list.get(end)>max){
                max=list.get(end);
                leaders.add(0,max);

            }
            end--;

        }
        return leaders;





    }
}
