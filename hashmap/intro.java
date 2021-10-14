import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    
    
    //hashmap is easy if we want to store something and its some other info, like (name, age) or (country, population)
    // (key,value) so that we can search something with its key name
    HashMap<String,Integer>map = new HashMap<>();
    map.put("india",100); // put store values inside hashmap
    map.put("china",90);
    map.put("pak",20);
    map.put("US",100);
    System.out.println(map);
    
    map.put("nigeria",60);
    map.put("uthopia",80);
    
    System.out.println(map.size()); // it will print the size of hashmap
    
    System.out.println(map.get("india") ); // get fetch corresponding info of key
    
    System.out.println(map.containsKey("nigeria")); //containKey  will check if its present or not
    System.out.println(map.containsKey("mayanmar"));
    
    
    Set<String> keys = map.keySet();  //keyset will print all the key in hashmap
    System.out.println(keys);
    
    for(String key:map.keySet()){
        Integer val = map.get(key);
        System.out.println(key+"  "+val);
    }
    
    
    
 }
 
 
 
 
 
 
 
}