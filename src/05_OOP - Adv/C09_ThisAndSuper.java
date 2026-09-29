class A{
    public A(){
        System.out.println("In A");
    }

    public A(int n){
        System.out.println("In A parameterized constructor");
    }
}

class B extends A{
    public B(){
        //super(n);
        System.out.println("In B");
    }

    public B(int n){
        System.out.println("In B parameterized constructor");
        this();
    }
}

class ThisAndSuper{
    public static void main(String args[]){
        //B obj = new B();        /* this will call constructor of both sub and super class. */
        
        B obj = new B(5);       /* this also call default cons of A instead of parameterized one, and parameterized constructor of B */




        /* ==================================================================================================================
        ?Q: So first of all, why it is calling the parent class even if we didn't make a object of parent or use any of their methods ?
        --> so there is a method in every object even when don't call them or write them in code, which is 'super()'.
            so basically, 
                    "new B(5) --> calls the parameterized constructor of B --> there is a line which can't be seen is of 'super()' which calls the constructor of super class(default one), even before the sout statement."

            
            And to call the parameterized constructor of the parent class you have to make the super() --> super(n) in child constructor.
        */





        /* ==================================================================================================================
        ?Q: So if every constructor have a super method, then what the super() method of the parent class is calling to ?
        -->     class A{                    class A extends Object {}
                    ----        --->            ----
                }                           }

                means every class in java is extending to Object class by default. means here B is extendinng to A and A is extending to Object.
        
        */



    

        /* ==================================================================================================================
        ?Q: So what if we want to initialize the both constructor of B and the default constructor of A ?
        --> simply just write
                B obj = new B(n);
                 ->this will call the parameterized constructor of B and put this() (without parameter) instead of super() in parameterized cons, and then the default cons will call the super cons.
        */
    }
}

