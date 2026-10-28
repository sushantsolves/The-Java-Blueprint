class A extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);           //! as this, we are telling our thread that after writing this, sleep for 10(milli-seconds)
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


public class C03_ThreadPriorityAndSleep{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());     //!we can get the priority for the objects. (from 1 to 10 ) and we have '5' as default priority.
        System.out.println(obj2.getPriority());


        obj2.setPriority(Thread.MAX_PRIORITY);      //!OR: MAX_PRIORITY -1 = 9
        /*
        -> setting priority is not like that block will execute first, its just a reference for the schedular, but the schedular also sees the other thing like which will take less time and other thngs. here we can only suggest.
        */


        obj1.start();
        try{            //!As we can only optimize it( it is not 100% accurate we just have to hit and try here.)
                Thread.sleep(10);           
            }catch(InterruptedException e) {e.printStackTrace();}

        obj2.start();
    }
}