abstract class A{
    public abstract void show();
    public abstract void config();
}

//!  So the concept here is that we can't made a direct obj of a abstract class so we need a class to firstly implement those abstract methods so that we can use those abstract classes.
/* But instead of making a separate class like this, we are going  to use the anonymous class part here too.

*/
// class B extends A{
//     public void show(){
//         System.out.println("In B show");
//     }
// }


class AbsAndAnynmsInrClass{
    public static void main(String args[]){
        // A obj = new B();
        // obj.show();

        /* So if we want to implement the interface of a abstract  class only then we can use this. */
        A obj1 = new A(){
            public void show(){
                System.out.println("In a anonymous class");
            }

            public void config(){
                //we can also define more than one abstract methods here.
            }
        }
        /* Very Imp Note: here don't think we are creating the obj of a abstract class, we are creating the object of this anonymous class, not abstract class. */
        obj1.show();
    }
}