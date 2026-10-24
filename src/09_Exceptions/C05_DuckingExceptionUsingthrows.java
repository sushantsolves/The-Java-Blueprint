/*
Why throws ?

?let we have a class in which there is a method which is critical(means can throw any error).
class A{
    --------
    --------
    <critical line>
    }

class B{
    --------
    --------
    <critical line>
    }   

?Now we have these two lines, now we can handle them here using try or catch in the class or method itself. or we can handle them at the place where we are calling them.
class C{
    --------
    --------
    A a = new A();
    B b = new B();
    a.method();  //calling method of class A
    b.method();  //calling method of class B
}
? now we can handle them here using try or catch, but also we ahve a option to let them handle by the other method calling this class method or directly to the main.

*But before putting these things to the other we have to mention it that this class have some critical things so be aware of it like.
class A{
    --------
    --------
    public void method() throws Exception{  //this is the way to mention that this method can throw an exception. So be aware of it.
        <critical line>
    }


?Now see this with live code and some more example with it.
*/



class A{
    public void show() throws ClassNotFoundException{        //this method can throw ClassNotFoundException, so we have to handle it somewhere else. So we are using throws keyword here.
        Class.forName("java.lang.String");       //this line can throw ClassNotFoundException, so we have to handle it somewhere else. So we are using throws keyword here.
    }
}


public class C05_DuckingExceptionUsingthrows{
    public static void main(String[] args) throws ClassNotFoundException{}{         //using throws with main is not a good activity, as if main is saying that I will not handle this, so JVM have to handle this and JVM say that ok then I will stop the program execution. so we should try that we'll handle this within the main method itself.
        A obj = new A();
        try{
            obj.show();        //this method can throw ClassNotFoundException, so we have to handle it somewhere else. So we are using throws keyword here.}
        }
        catch(ClassNotFoundException e){
            System.out.println("the class is not found.");
        }
    
    } 
}