/*Dynamic Method Dispatch is the mechanism by which Java decides at runtime which overridden method to execute, based on the actual object being referred to. */

class A{
    public void show(){
        System.out.println("Show A");
    }

    public void display(){
        System.out.println("Display A");
    }
}

class B extends A{
    public void show(){
        System.out.println("Show B");
    }

    public void printB(){
        System.out.println("Print B");
    }
}

class C extends B{
    public void show(){
        System.out.println("Show C");
    }
}

class DynamicMethodDispatch{
    public static void main(String arg[]){
        A obj1 = new A();
        obj1.show();        //Show A
        obj1.display();     //Display A
        // obj1.printB();

        A obj2 = new B();
        obj2.show();        //Show B
        obj2.display();     //Display A
        // obj2.printB();

        A obj3;
        obj3 = new A();       // -> created a variable of reference A, with value calling the A constructor.
        obj3.show();        //OP: Show A
        obj3 = new B();         // -> replacing the reference of A class from obj3 with B class.
        obj3.show();        //OP: Show B
        obj3 = new C();
        obj3.show();        //OP: Show C
    }
}