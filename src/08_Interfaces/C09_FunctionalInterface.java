@FunctionalInterface        //if we want to make sure that our interface will contain only one method then we can directly use this annotation on top of the interface. If we try to add more than one method then it will give compile time error. 
interface A{
    void show();
}

public class C09_FunctionalInterface{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){             //we can also do this by making another class and the old ways or by this anonymous class method. But why we choose only functional interface? bcz now we are entering into concepts of java8 and they trying to make the lang a little bit easier to make and one of the new concepts they introduced is lambda expression. And lambda expression can only be used with functional interface. 
                System.out.println("Hello");
            }
        };
        obj.show();
    }       
}