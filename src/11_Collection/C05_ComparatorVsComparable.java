// Now if we have a collection, how can we sort it.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class C05_ComparatorVsComparable {
    public static void main(String[] args){

        List<Integer> nums = new ArrayList<>();

        // nums.add(5);
        // nums.add(4);
        // nums.add(3);
        // nums.add(2);
        // nums.add(1);

        // Collections.sort(nums);     //Collections -> class, sort -> method, nums -> collection



        //! Now what if we need our own logic to sort the collection, we can use Comparator interface.
        
        
        
        Comparator com = new Comparator<Integer>()      //anonymous class
        {
            public int compare(Integer i, Integer j){       //compare method is used to compare two objects
                // if(i>j){
                //     return 1;       // returning 1 will swap
                // }else if(i<j){
                //     return -1;      // returning -1 will not swap
                // }else{
                //     return 0;
                // }

                // OR
                if(i%10 >j%10)
                    return 1;       //to sort according to the last digit of number.
                else
                    return -1;
            }
        };

        List<Integer> num = new ArrayList<>();
        num.add(43);
        num.add(31);
        num.add(72);
        num.add(49);
        num.add(34);

        Collections.sort(num, com);     //Collections -> class, sort -> method, num -> collection, com -> comparator
                                //-> so in order to sort the collection with our logic, we need to pass our object with the collection itself.

        System.out.println(num);
    }
}


//!Q to try: create a collection of string and sort them according to the length of them.