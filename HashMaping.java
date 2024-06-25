import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMaping {
    public static void main(String agrs[]){
//country(Key), population(value)
HashMap<String,Integer> map=new HashMap<>();

// Insertion(add)
map.put("India",120);
map.put("us",30);
map.put("china",130);
System.out.println(map);

//Search
if(map.containsKey("India")){
    System.out.println("key is present in the map");

}else{
    System.out.println("key is not present in the map");
}
//Search Key
System.out.println(map.get("china"));  //key exists
System.out.println(map.get("Indonesia"));  //key doesnot exist


//HashMap loop
//Syntax     Map.Entry<Integer,Integer> e : Map.entrySet()
//Integer=Key       // Integer=Value
for(Map.Entry<String,Integer> e : map.entrySet())
{
System.out.println(e.getKey());
System.out.println(e.getValue());
}

// or
// Second method (pair print)
Set<String> keys= map.keySet();
for(String key : keys){
    System.out.println(key+ " " + map.get(key));
}

// Remove 
map.remove("China");
System.out.println(map);
}
}

