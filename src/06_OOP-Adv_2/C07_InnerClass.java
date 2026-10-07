class A{
    int age;
    public void show(){
        System.out.println("In A > show()");
    }

    class B{
        public void config(){
            System.out.println("Inside A > B > config() method");
        }
    }

    // static class C{
    //     public void config(){
    //         System.out.println("Inside A > C > config() method");
    //     }
    // }
}


public class C18_InnerClass{
    public static void main(String arg[]){
        A obj = new A();
        obj.show();

        /*You can't just simply can B obj = new B(), and also if you compile the code then there will be three .class files will be created as <our main file name>, A, A$B --> which represents the  */
        /*Why ? -> so in case to use a method of a class we have to make a obj first and write obj.show(), similarly if we want to access the inner class of A, we need a obj of A first. */
        A.B obj1 = obj.new B();
        obj1.config();


        /*We don't need to create a class first to use C, as it is a static class */
        A.C obj2 = new A.C();
        obj2.config();

        /*NOTE: You can't make a the main class for example 'A' as a static class here, only the inner class can be made as static. */
    }
}