  //All properties are include
import java.util.ArrayList;      //ArrayList Package

public class ArrayLIstIntroduction {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        ArrayList<String> list2=new ArrayList();
        ArrayList<Float> list3=new ArrayList();
        ArrayList<Boolean> list4=new ArrayList();

        //Add o(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //ArrayList ke size ko find karna
     
System.out.println(list.size());     //output = 5

        //Get Element o(1)

        int element = list.get(2);
        System.out.println(element);

        // Remove Element o(n)

        list.remove(2);
        System.out.println(list);

        //Sel Element o(n)

        list.set(2,10);
        System.out.println(list);

        //contains Element
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
     
        
// ArrayList me find ko karna?

for(int i=0; i<list.size(); i++){
    System.out.println(list.get(i)+ " " );
}
System.out.println();

    }
}
