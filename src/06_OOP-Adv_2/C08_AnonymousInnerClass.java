/*
anonymous -> something which don't have a name.
*/

class A{
    public void show(){
        System.out.println("In A show");
    }
}

// We want to change the behaviour of method show() of class A. 
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}


public class C19_AnonymousInnerClass{
    public static void main(String args[]){
        A obj1 = new B();
        obj1.show();        //this will simply print "In a show", but what if we want to change the work of this method? -> override with extending with another class, right ?


        /*The new design */
        A obj2 = new A()
        {                           /*Now we make this short class for a change in a main class (A) and if you see the .class then there is only '<classname> $', as this clas have no name, that's why its called as anonymous class */
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj2.show();

    }
}