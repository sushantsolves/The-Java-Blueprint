@FunctionalInterface
interface A{
    void show(int n);
}


@FunctionalInterface
interface B{
    void display(int n);
}

public class C10_LambdaExpression{
    public static void main(String[] args) {
        A obj = (i) -> System.out.println("Hello" + i); //this is the lambda expression. It is a new concept introduced in java8. It is used to implement the functional interface. It is a short form of anonymous class. It is used to provide the implementation of the abstract method of functional interface. 

        B obj1 =j ->{             // as if you need multiple lines of code then we can use this type of syntax. If we have only one line of code then we can use the above syntax.
            System.out.print("Hello ");
            System.out.println("World "+ j);
        };

        obj.show(5);
        obj1.display(7);


        /*
        -> You have seen above like we don't declare the variable type 'int' here, bcz it is already mentioned in interface upthere.
        -> we also removed the braces here bcz we have only one variable to assign in B too.

        -> Now why we done this ?
        as you see in background, there has only three files created for A, B and our main file, but not for the anonymous class file, but the sizse of our our main file has increased bcz of lambda function but still there is less amount of file to manage.
        */
    }
}