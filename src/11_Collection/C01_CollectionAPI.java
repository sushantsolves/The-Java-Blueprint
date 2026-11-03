/*
==========================================
                COLLECTION
==========================================

Three types of Collection:
    -> Collection API (concept)
    -> Collection (interface)
    -> Collections (class)

*/



/*
 * ============================================================
 *                 JAVA COLLECTION FRAMEWORK
 * ============================================================
 *
 * DEFINITION:
 * Collection in Java is a framework that provides classes and
 * interfaces to store, manipulate, and process groups of objects.
 *
 * It is available in:
 * java.util package
 *
 * IMPORTANT:
 * Collection is an interface, whereas Collections is a utility
 * class containing static methods to operate on collections.
 *
 * ============================================================
 * 1. WHY COLLECTIONS?
 * ============================================================
 *
 * 1. Dynamic size: Unlike arrays, collections can grow or shrink.
 * 2. Ready-made methods: Sorting, searching, adding, removing.
 * 3. Multiple data structures: List, Set, Queue, etc.
 * 4. Better code reusability and flexibility.
 *
 * ============================================================
 * 2. COLLECTION FRAMEWORK HIERARCHY
 * ============================================================
 *
 *                    Iterable (Interface)
 *                         |
 *                    Collection
 *                         |
 *          +--------------+--------------+
 *          |              |              |
 *         List           Set           Queue
 *          |              |              |
 *     +----+----+     +---+----+      +---+------+
 *     |    |    |     |        |      |          |
 *   Array Linked Vector Hash  Linked Priority  Deque
 *   List  List         Set   HashSet Queue     |
 *                                            ArrayDeque
 *
 * NOTE:
 * Map is NOT a child of Collection.
 * It is a separate interface in the Collection Framework.
 *
 * ============================================================
 * 3. COLLECTION INTERFACE
 * ============================================================
 *
 * Collection is the root interface of the Collection hierarchy.
 *
 * IMPORTANT METHODS:
 *
 * add(element)          -> Adds an element.
 * addAll(collection)    -> Adds all elements of another collection.
 * remove(element)       -> Removes a specified element.
 * removeAll(collection) -> Removes matching elements.
 * retainAll(collection) -> Retains only common elements.
 * clear()               -> Removes all elements.
 * contains(element)     -> Checks whether an element exists.
 * containsAll(c)        -> Checks whether all elements exist.
 * size()                -> Returns the number of elements.
 * isEmpty()             -> Checks whether collection is empty.
 * iterator()            -> Returns an iterator.
 * toArray()             -> Converts collection into an array.
 *
 * ============================================================
 * 4. LIST INTERFACE
 * ============================================================
 *
 * DEFINITION:
 * List is an ordered collection that allows duplicate elements.
 * It maintains insertion order and supports index-based access.
 *
 * IMPLEMENTATIONS:
 *
 * A. ArrayList
 *    - Uses a dynamic array internally.
 *    - Fast random access.
 *    - Slower insertion/deletion in the middle.
 *    - Not synchronized.
 *
 * B. LinkedList
 *    - Uses a doubly linked list internally.
 *    - Efficient insertion/deletion at ends.
 *    - Random access is slower.
 *    - Implements both List and Deque.
 *
 * C. Vector
 *    - Dynamic array implementation.
 *    - Synchronized (thread-safe individual operations).
 *    - Legacy class.
 *
 * D. Stack
 *    - Follows LIFO (Last In First Out).
 *    - Extends Vector.
 *    - push(), pop(), peek().
 *    - Deque is generally preferred for stack operations.
 *
 * ============================================================
 * 5. SET INTERFACE
 * ============================================================
 *
 * DEFINITION:
 * Set is a collection that does not allow duplicate elements.
 *
 * IMPLEMENTATIONS:
 *
 * A. HashSet
 *    - Does not guarantee iteration order.
 *    - Allows one null element.
 *    - Uses hashing internally.
 *    - Average O(1) add, remove and contains.
 *
 * B. LinkedHashSet
 *    - Maintains insertion order.
 *    - Does not allow duplicates.
 *    - Allows one null element.
 *
 * C. TreeSet
 *    - Stores elements in sorted order.
 *    - Does not allow duplicates.
 *    - Generally does not allow null.
 *    - Uses a Red-Black Tree internally.
 *    - O(log n) basic operations.
 *
 * ============================================================
 * 6. QUEUE INTERFACE
 * ============================================================
 *
 * DEFINITION:
 * Queue is generally used to process elements in FIFO order.
 * FIFO = First In First Out.
 *
 * IMPORTANT METHODS:
 *
 * add(e)      -> Inserts element; throws exception on failure.
 * offer(e)    -> Inserts element; returns false on failure.
 * remove()    -> Removes head; throws exception if empty.
 * poll()      -> Removes head; returns null if empty.
 * element()   -> Retrieves head; throws exception if empty.
 * peek()      -> Retrieves head; returns null if empty.
 *
 * IMPLEMENTATIONS:
 *
 * A. PriorityQueue
 *    - Processes elements according to priority.
 *    - Natural ordering by default.
 *    - Not necessarily FIFO.
 *    - Does not allow null.
 *
 * B. ArrayDeque
 *    - Resizable double-ended queue.
 *    - Insertion and deletion from both ends.
 *    - Can be used as Queue or Stack.
 *    - Does not allow null.
 *
 * ============================================================
 * 7. MAP INTERFACE (SEPARATE FROM COLLECTION)
 * ============================================================
 *
 * DEFINITION:
 * Map stores data in key-value pairs.
 * Keys must be unique, but values can be duplicated.
 *
 * IMPLEMENTATIONS:
 *
 * A. HashMap
 *    - Does not guarantee order.
 *    - Allows one null key and multiple null values.
 *
 * B. LinkedHashMap
 *    - Maintains insertion order by default.
 *    - Allows null keys and values.
 *
 * C. TreeMap
 *    - Stores keys in sorted order.
 *    - Does not allow null keys with natural ordering.
 *
 * D. Hashtable
 *    - Synchronized legacy class.
 *    - Does not allow null keys or values.
 *
 * IMPORTANT MAP METHODS:
 *
 * put(key, value)       -> Inserts or updates a mapping.
 * get(key)              -> Returns value for a key.
 * remove(key)           -> Removes a mapping.
 * containsKey(key)      -> Checks key existence.
 * containsValue(value)  -> Checks value existence.
 * keySet()              -> Returns all keys as a Set.
 * values()              -> Returns all values.
 * entrySet()            -> Returns all key-value entries.
 *
 * ============================================================
 * 8. ITERATOR
 * ============================================================
 *
 * DEFINITION:
 * Iterator is used to traverse elements of a collection.
 *
 * METHODS:
 *
 * hasNext() -> Checks whether another element exists.
 * next()    -> Returns the next element.
 * remove()  -> Removes the last returned element (optional).
 *
 * ============================================================
 * 9. GENERICS IN COLLECTIONS
 * ============================================================
 *
 * Generics allow us to specify the type of elements stored.
 *
 * Example:
 *
 * ArrayList<Integer> nums = new ArrayList<>();
 *
 * Advantages:
 * 1. Type safety.
 * 2. No unnecessary type casting.
 * 3. Compile-time error detection.
 *
 * NOTE:
 * Collections store objects, not primitive data types.
 * Use wrapper classes such as Integer, Double, Character.
 *
 * ============================================================
 * 10. COLLECTIONS UTILITY CLASS
 * ============================================================
 *
 * Collections is a utility class in java.util.
 *
 * IMPORTANT STATIC METHODS:
 *
 * Collections.sort(list)       -> Sorts a list.
 * Collections.reverse(list)    -> Reverses a list.
 * Collections.shuffle(list)    -> Randomly shuffles elements.
 * Collections.max(collection)  -> Returns maximum element.
 * Collections.min(collection)  -> Returns minimum element.
 * Collections.frequency(c, e)  -> Counts occurrences of element.
 * Collections.swap(list, i, j) -> Swaps two elements.
 *
 * ============================================================
 * 11. IMPORTANT DIFFERENCES
 * ============================================================
 *
 * Collection vs Collections:
 *
 * Collection:
 * - Interface.
 * - Root of List, Set and Queue.
 * - Represents a group of objects.
 *
 * Collections:
 * - Utility class.
 * - Contains static methods.
 * - Provides sorting, reversing, etc.
 *
 * List vs Set:
 *
 * List:
 * - Allows duplicates.
 * - Maintains insertion order.
 * - Supports index-based access.
 *
 * Set:
 * - Does not allow duplicates.
 * - Ordering depends on implementation.
 * - No index-based access.
 *
 * ArrayList vs LinkedList:
 *
 * ArrayList:
 * - Dynamic array.
 * - Fast random access.
 * - Middle insertion/deletion requires shifting.
 *
 * LinkedList:
 * - Doubly linked list.
 * - No direct random access.
 * - Efficient insertion/deletion at ends.
 *
 * ============================================================
 * 12. TIME COMPLEXITY (AVERAGE CASE)
 * ============================================================
 *
 * Operation       ArrayList     LinkedList    HashSet
 * ---------------------------------------------------
 * Add at end      O(1)*         O(1)          O(1)*
 * Access index    O(1)          O(n)          Not supported
 * Search          O(n)          O(n)          O(1)*
 * Remove          O(n)          O(n)**        O(1)*
 *
 * * Amortized O(1) for ArrayList append; average O(1) hashing.
 * ** LinkedList removal is O(1) when the node is already known.
 *
 * ============================================================
 * 13. PRACTICAL EXAMPLE
 * ============================================================
 *
 * import java.util.*;
 *
 * class CollectionDemo {
 *     public static void main(String[] args) {
 *
 *         // Creating an ArrayList
 *         ArrayList<Integer> nums = new ArrayList<>();
 *
 *         // Adding elements
 *         nums.add(10);
 *         nums.add(20);
 *         nums.add(30);
 *         nums.add(20);
 *
 *         // Printing collection
 *         System.out.println(nums);
 *
 *         // Accessing element
 *         System.out.println(nums.get(1));
 *
 *         // Removing element at index 0
 *         nums.remove(0);
 *
 *         // Searching
 *         System.out.println(nums.contains(20));
 *
 *         // Traversing using enhanced for loop
 *         for (int num : nums) {
 *             System.out.println(num);
 *         }
 *
 *         // Sorting
 *         Collections.sort(nums);
 *
 *         System.out.println(nums);
 *     }
 * }
 *
 * ============================================================
 * 14. IMPORTANT INDUSTRY NOTES
 * ============================================================
 *
 * 1. ArrayList is a common default choice for ordered data.
 * 2. HashMap is widely used for key-value lookups.
 * 3. HashSet is useful for removing duplicates.
 * 4. PriorityQueue is useful for scheduling and priority tasks.
 * 5. ConcurrentHashMap is preferred for many concurrent map
 *    operations instead of synchronizing an entire HashMap.
 * 6. Choose a collection based on access patterns and requirements.
 *
 * ============================================================
 * 15. QUICK REVISION
 * ============================================================
 *
 * List  -> Ordered + Duplicates allowed.
 * Set   -> No duplicates.
 * Queue -> Processing elements, generally FIFO.
 * Deque -> Insertion/removal from both ends.
 * Map   -> Key-value pairs.
 *
 * Collection -> Interface.
 * Collections -> Utility class.
 * Iterator -> Traversal.
 * Generics -> Type safety.
 *
 * ============================================================
 *                         END OF NOTES
 * ============================================================
 */
