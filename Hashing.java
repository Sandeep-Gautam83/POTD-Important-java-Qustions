import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main (String args[]){
        //Creating Hashset(Line no 5 syntax)
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);
        //Searching - contains 
if(set.contains(1)){
    System.out.println("set contains 1");
}
if(! set.contains(6)){
    System.out.println("does not contains");
}
//Delete
set.remove(1);
if(!set.contains(1)){
    System.out.println("does not contains 1 - we deleted 1");
}
//Size
System.out.println("Size of set is : " +set.size());

//Print all elements
System.out.println(set);

//Iterator
Iterator it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
    }
}
