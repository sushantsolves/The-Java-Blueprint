class A extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
        }
    }
}


public class C02_MultipleThreads{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();        //Now I want both methods to run parallely.
        // obj2.show();

        /*Now the question is that how to make these normal objects as threads ?
            -> extend the class to Thread 
            -> In every class you need a run method.
            -> and a start method with the objects.
        */

        obj1.start();
        obj2.start();

        //Now here a imp thing to notice, you will see the output for both the normal class and this one thread as same but actually they are running parallely, just the difference is the vlaue of loop is 10(very small), so as we are giving even a very small amount of time to a line it completes the loop at once, but if we increase the number to 100 you can see the difference.
        // And this line time issue is bcz of a concept in our OS which is known schedular.
    
    /* To run them simultaneously or in more control way, we will see in next file. */
    }
}