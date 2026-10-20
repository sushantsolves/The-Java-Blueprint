/*
NOW, we will see how we can extend interfaces and implement them in classes.
also the type of inheritance (multiple inheritance) which is not possible in classes, but it is possible in interfaces.
And how the interfaces can use the methods of other interfaces, and how the classes can implement multiple interfaces.

The most important thing to note here is that, if a class implements an interface, then it has to implement all the methods of that interface. If it fails to do so, then the class will become an abstract class.
*/


/*
*NOTE:
!class - class -> extends
!class - interface -> implements
!interface - interface -> extends
*/


interface A{
    void show();
    void confix();
}

interface B{
    void run();
}

interface C extends A, B{       /*NOTE: Interfaces can extends other interfaces and can use their methods same as classes. */
    void display();
}


class c1 implements A, C{           /*NOTE: So class c1 can implement both A and C */
    public void show(){     // for A
        System.out.println("show in c1");
    }

    public void confix(){   // for A
        System.out.println("confix in c1");
    }

    public void run(){      // for C --> as C extends A and B, so c1 has to implement all the methods of A and B.
        System.out.println("run in c1");
    }

    public void display(){  // core method of C
        System.out.println("display in c1");
    }
}



public class C03_MoreOnInterface{
    public static void main(String a[]){
        c1 obj = new c1();
        obj.show();
        obj.confix();
        obj.run();
        obj.display();

        A obj1 = new c1();       //So here we can create a obj of A, but can't instantiate it. and we can use the methods of A only.
        obj1.show();
        //obj1.run();       //error: cannot find symbol
    }
}