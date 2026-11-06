/*
Ok so in list we have seen that we can store multiple values and there are multiple methods too, but why do we need set ?
-> So in order to store only unique values we need to get set in the game.
        like: In list we add 5 two times, we have a repetitive value (5) at two points but in the set, if we add a element again and again but it still have only one elements, as it only store unique values.
 
!-> now as general, it don't follow the sequence / indexing.
 */

// import java.util.Collection;
import java.util.Set;
import java.util.*;

public class C03_Set{
    public static void main(String a[]){

        Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();      -> when we want the values to be sorted.

        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(2);
        nums.add(5);

        // for(int n: nums){
        //     System.out.println(n);
        // }

    // Now intead of using a for loop, we can use iterator (As collection extends to Iterable and Iterable has a method iterator), which work is to iterate over all the values of a set.
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()) // ->has next tell us the presence of the next value.
            System.out.println(values.next());


    }
}