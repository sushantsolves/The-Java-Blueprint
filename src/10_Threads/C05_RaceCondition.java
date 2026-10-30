/*
Race Conditions:-
-->




    1. threads
    2. Mutation -> you can change something

    --> what if we are doing mutation with multiple threads ?
            let we have two threads t1 and t2, 
            and both are working with a variable i.

                    Now both t1 and t2 has made some change with i, at a single time it will create issue. (like a bank account with 2 atm card and 10K as balance, now both take 7K out at same time )
                    so it will create a issue, so if we are working with threads we should work with immutable data most of the time.

                    And if you are working with a mutable value, make sure to make it thread safe.
                    !Thread Safe -> Only one thread can work with that at one time.

*/
class Counter{
    int count;
    public synchronized void increment(){
        count++;    //the more time we call increment, the more count increase.
    }
}


public class C05_RaceCondition{
    public static void main(String a[]) throws InterruptedException{

        Counter c = new Counter();

        Runnable obj1 = () ->
        {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        System.out.println("Count: "+c.count);  

        // t1.join();
        System.out.println("Count: "+c.count);

        // t2.join();

        System.out.println("Count: "+c.count);
    }
}


/*
1. What is happening here, so we have a main() thread in which we have further 2 threads

2. And now what to do a method to make it thread safe ?
! To make a method thread safe simply add synchronized keyword during method declaration.
*/