/*
abstract class -> we can create both normal and abstract methods.

But when we have a abstract class, which only contains abstract methods then we have a another method to do it.

======================= INTERFACE ========================
-> A interface is not a class.
-> all the methods of a methods of a interface is a 'public abstract' by default, so if you write only void show(); in method there is no error.
-> the methods can't get implemented in the interface, so classes have to implement it. The interface os kist fpr voew


*/


interface A{
    /*
    NOTE: so interfaces don't have any memory, so if you have a question like why the variable to be the final so if there is no memory then how will you change the value of the variable.
    */

    int age = 10;           //By default: public static final is there, and bcz of final we have to define its value here.
    String area = "India";    


    void show();            //By default: public and abstract is there
    void confix();
}

class B implements A{
    // We hvae to implement all the methods of interface. and if you fail to do that, your class will become a abstract class.

    public void show(){
        System.out.println("show in B");
    }

    public void confix(){
        System.out.println("confix in B");
    }
}



public class C01_Interface{
    public static void main(String a[]){
        A obj;          //Now here you can create a obj of A, but can't instantiate it.
        //obj = new A();
        obj = new B();

        obj.show();
        obj.confix();
        System.out.println("Age: " + A.age);
        System.out.println("Area: " + A.area);

    }
}