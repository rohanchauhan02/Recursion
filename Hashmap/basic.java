
import java.util.*;
import java.lang.*;

public class basic{
    public static void main(String []args){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India", 130);
        map.put("Pakistaan",20);
        map.put("China",150);
        map.put("America",30);
        System.out.println(map);
        System.out.println(map.get("India"));
        System.out.println(map.get("key"));
        System.out.println(map.containsKey("India"));
        Set<String>keys=map.keySet();
        System.out.println(keys);
        for(String key:map.keySet())
            System.out.println(key);
    }
}