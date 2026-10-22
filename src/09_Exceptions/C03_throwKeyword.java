public class C03_throwKeyword{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try{
            int c = a/b; // this will move the cursor directly to the catch part.
            
            if(b==0){
                System.out.println("Division by zero");
                throw new ArithmeticException("Division by zero is not allowed");       //throw keyword is used to throw an exception explicitly. It is used to throw an exception when a specific condition is met. In this case, we are throwing an ArithmeticException when b is zero. The message "Division by zero is not allowed" will be displayed when the exception is thrown.
            }
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException: "+e.getMessage());
        }
        // catch (Exception e) {
        //     System.out.println("Something is wrong ");
        // }
    }

}