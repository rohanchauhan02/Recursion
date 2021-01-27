import java.util.*;
public class priorityQueue{
    public static ArrayList<Integer>pq=new ArrayList<>();

    public static void main(String []args){
        int []arr={33,66,25,20,10,25,99,9};
        createHeap(arr);
    }
    public static void createHeap(int []arr){
        for(int ele:arr)
            pq.add(ele);
        System.out.println(pq);
    }
    public static void add(int data){
        pq.add(data);
        unheapyfy(pq.size()-1);
    }
    public static void downheapyfy(int idx){
        int lch=2*idx;
        
    }
}