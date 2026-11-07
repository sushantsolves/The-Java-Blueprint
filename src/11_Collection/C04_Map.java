/*
Now let we have a list like:
    56 | 23 | 67 | 92
    0    1    2    3
now lets think that if we want something else instead of this number indexxing, like assigning each number with some name representing students marks. means key value pair, and this is comes under map.
-> map is collection of key and value pair.
*/


// import java.util.Collection;
import java.util.Map;
import java.util.*;

public class C04_Map{
    public static void main(String a[]){

        Map<String, Integer> students = new HashMap<>();    //! -> here the <String,Integer> could be any datatype pair.
        // Map<String, Integer> students = new HashTable<>();    //! -> hashtable is synchronized 



        // students.put(key, value);    --> the format we have to put.

        students.put("Navin",56);
        students.put("Harsh",23);
        students.put("Sushil",45);
        students.put("Sushant",98);

    //! Print the complete map.
        System.out.println(students);   // --> still its now following a sequence.
    
    //! get any specific value through a key.
        System.out.println(students.get("Sushant"));    // OP: 98

    //! now changing value of a key, as key can't be repeated so it will replace the previous value with the new one.
        students.put("Harsh", 65);
        System.out.println(students.get("Harsh"));

    //! print all the key set at once.
        System.out.println(students.keySet());

    //! accessing all the keys and the values of a map
        for(String key: students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    }
}