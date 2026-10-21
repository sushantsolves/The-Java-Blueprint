/*
TYPES OF ERRORS:
    1. Compile time error -> which occurs at the time of compilation. (Syntax errors, type mismatch, etc)
    2. Runtime error -> which occurs at the time of execution (NullPointerException, ArrayIndexOutOfBoundsException, etc)
    3. Logical error -> which occurs at the time of execution but the output is not as expected (wrong logic, wrong algorithm, etc)
*/


public class C01_ExceptionAndErrors{
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int arr[] = new int[5];

        try{
            int c = a/b; // this will throw ArithmeticException                 //Also one imp thing to notice here is, the try block runs line by line and if we divide by non-zero then it print it in terminal and then give the array issue, but if we divide by zero it directly terminates the try and cursor move to the catch block.
            System.out.println(c);
            arr[10] = 20; // this will throw ArrayIndexOutOfBoundsException

        }catch(ArithmeticException e){
            System.out.println("ArithmeticException: "+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: "+e);       
        }
        
        catch(Exception e){                         //if any of above specific exception is not found then it will go to this catch block and print the message. This is the last catch block which will catch all the exceptions. So it is always recommended to keep this catch block at the end of all the catch blocks.
            System.out.println("Exception: "+e.getMessage());
        }finally{
            System.out.println("This block will always execute");       //Always run
        }

        System.out.println("End of the program");       //Always run
    
    
    
        /*
        NOTE:
        e -> the actual message created by jvm and we generally see in our terminals
        e.getMessage() -> gives the message of the exception that what went wrong here.
        */




        /*
        A example structure of exceptions
        
        Throwable   (Top most class in exception hierarchy)
            |
        Exception
            |
        RuntimeException
            |
        ArithmeticException

        */
    }
}
