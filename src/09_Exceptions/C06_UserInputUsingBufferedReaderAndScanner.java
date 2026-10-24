import java.io.BufferedReader;
import java.io.IOException;

public class C06_UserInputUsingBufferedReaderAndScanner{
    public static void main(String[] args) throws Exception {
        
        //To print something in console we use:
        System.out.println("Enter a number:");
        /*Here, 'println' is a fuction of 'PrintStream'.class > and 'out' is a object of PrintStream which is already created */

        //So if we try to take input, what would be the line
        int num = System.in.read();   //it returns a int value but it might throws an IO Exception (checked exception) so we need to handle this. so put in main.
        System.out.println("You entered: " + (char)num);   //it will print the ascii value of the number entered. So we need to convert it into char to get the actual number.
    
    
        /*So lets don't have this headhe of IO and other things, so we have a class called BufferedReader. */
        InputStreamReader isr = new InputStreamReader(System.in);   //this is a class which is used to read the input from the console. It is a bridge between byte stream and character stream. It reads bytes and decodes them into characters using a specified charset. It is a subclass of Reader class.
        BufferedReader bf = new BufferedReader(isr);


        // int num = bf.readLine(); --> but thhis will give u a string.
        int num = Integer.parseInt(bf.readLine());  //this will convert the string to int. parseInt is a static method of Integer class which is used to convert a string to int.
    
    
        bf.close();




        /* It is still a complex and old method, now we have a new practice. */
        Scanner sc = new Scanner(System.in);   //this is a class which is used to read the input from the console. It is a part of java.util package. It is a simple text scanner which can parse primitive types and strings using regular expressions. It is a subclass of Object class.
        int n = sc.nextInt();
    }
}