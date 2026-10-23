class AgeException extends Exception{
    public AgeException(String string){
        super(string);      //sending string to the parent class Exception constructor which will set the message of the exception.
        System.out.println("From AgeException constructor");
    }
}



public class C04_CustomException{
    public static void main(String[] args) {
        int a = 10;
        int b = 17;
        int c = 0;

        try{
            // int d = a/c; 
            
            if(b<=18){
                throw new AgeException("string as parameter");     //if it throw it, we have to catch it somewhere else too. 
            }
        }
        //catch(ArithmeticException e){
        //     System.out.println("ArithmeticException: "+e.getMessage());
        // }

        catch (AgeException e){         //our custom exception
            System.out.println("from custom exception catch block." +e.getMessage());           /*! if we don't pass any value of string, e.getMessage give us null */
        }
        
        // catch(Exception e){
        //     System.out.println("Something is wrong ");
        // }
    }
}