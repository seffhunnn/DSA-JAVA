import java.util.HashSet;
import java.util.Iterator;

public class hashseteEG {
    public static void main(String[] args) {
        //Creation
       HashSet<Integer> set= new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //list.add(ele)

        //Size
        System.out.println("Size of set is "+set.size());

        //To print all elements
        System.out.println(set);

        //Iterator (to traverse)
        Iterator it= set.iterator();
        //hasNext; next
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");
        }
    }
}
