/*
Point: so if we have a class A which I want a child of a parent class Z but also want it to be a thread. but multiple inheritance is not allowed.
    So If we check, Thread also implements to Runnable which contains a method run(), and we are declaring the run method in our class A. so we can directly implement our class to Runnable.

*/


class A implements Runnable{       //bcz threads also extends to Runnable
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);           
            }catch(InterruptedException e) {e.printStackTrace();}
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);           
            }catch(InterruptedException e) {e.printStackTrace();}

        }
    }
}


public class C04_RunnableVSThread{
    public static void main(String args[]){
        Runnable obj1 = new A();            //Reference of an interface and object is of a class.

        /*
        --> If we remove the entire class A, we can use this method to define it.

        Runnable obj1 = new Runnable(){
            public void run(){
                for(int i=0; i<10; i++){
                    System.out.println("hi");
                    try{
                        Thread.sleep(10);           
                    }catch(InterruptedException e) {e.printStackTrace();}
                }
            }
        }
        */

       /*
        method 3: Also we can do it with the help of lambda functions.
       
       Runnable obj1 = () ->
        {
            for(int i=0; i<10; i++){
                System.out.println("Hello");
                try{
                    Thread.sleep(10);           
                }catch(InterruptedException e) {e.printStackTrace();}

            }
        }
       
       */


        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}