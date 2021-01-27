import java.util.*;
import java.lang.*;
public class hashmap{
    public static void frequency_map(String str){
        HashMap<Character,Integer>feq=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(feq.containsKey(ch)){
                int count=feq.get(ch)+1;
                feq.put(ch,count);
            }else{
                feq.put(ch,1);
            }
        }
        System.out.println(feq);
        int max=0;
        for(Character key:feq.keySet()){
            if(feq.get(key)>max) max=feq.get(key);

        }
        System.out.println(max);
    }
    public static void main(String []args){
        frequency_map("abgkhgcjtcutjckhvjtrxtgfcjgfcrtxhgvhgcturxgh");
    }
}