// import java.util.Collection;
import java.util.List;
import java.util.*;

public class C02_ArrayList{
    public static void main(String a[]){

        //Collection nums = new Collection  --> can't say bcz the collection is a interface.
        

        /*
        COLLECTION
            |-> There are certain more interfaces which implements collection.
                |-> List - for these interfaces, there have their own class implementation like ArrayList, LinkedList
                |-> Queue - DeQueue
                |-> Set - HashSet, LinkedHashSet
        */

        // Collection<Integer> nums = new ArrayList<Integer>();
        // but if we need to perform some operations over nums like .get or .indexOf, we need to convert Collection -> List.
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for(int n: nums){
            System.out.println(n);
        }

        System.out.println(nums);

        System.out.println(nums.get(2));        //3
        System.out.println(nums.indexOf(3));    //2
    }
}