// Check by running code as to link the AdvCalc with this part ..




/*
A simple difference between has and in ...
    has --> A laptop 'has' motherboard, keyboard, etc.
    is --> A laptop 'is' a computer, means a laptop borrow its properties from a computer.
*/

/*
INHERITANCE
--> accessing parents class property in a child class.

    parent class   ->     child class
    super class    ->     sub class
    base class     ->     derived class


    =========TYPES==========
    -> Single Inheritance   (discussed here, just one parent and one child class, you can say the AdvCalc as child and Calc as Parent)
    -> multilevel Inheritance   (Also discussed here, as soon as the AdvAdvClass file created there is a multi level Inheritance concept came into the game.)
    -> Hierarchical Inheritance
    -> Multiple Inheritance (Java doesn't support it, but there are several other ways to do it, discussed later.)
    -> Hybrid Inheritance
*/


/*
NOTE: As we make different classes in a single file and when we compile it, the javac made different .class files for different classes and then we call only the main class from 'java' through terminal to run the main code and wherever the other class name come (during obj creation mainly) in the main code, java execute it too. 
*/


class Calc{

    public int add(int a , int b){
        return a+b;
    }

    public int sub (int a, int b){
        return a-b;
    }
}

class Inheritance{
    public static void main(String arg[]){
        Calc obj1 = new Calc();
        AdvCalc obj2 = new AdvCalc();
        AdvAdvClass obj3 = new AdvAdvClass();
        int r1 = obj1.add(4,5);
        int r2 = obj1.sub(7,5);

        int r3 = obj2.multi(2,3);
        double r4 = obj2.div(15,4);
        int r5 = obj2.add(4,5);
        int r6 = obj2.sub(9,4);

        double r7 = obj3.add(7,3);
        double r8 = obj3.sub(7,3);
        double r9 = obj3.multi(7,3);
        double r10 = obj3.div(7,3);
        double r11 = obj3.pow(2,3);


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);
    }
}

/*
Here, As we made two extra file 'AdvCalc.java' and 'AdvAdvClass.java' to inherit their properties. so its a example of multilevel Inheritance.

       Calc
         ↑
      AdvCalc
         ↑
    AdvAdvClass
*/