/*
!HOW JAVA WORKS ?
    -> To compile the code run "javac <filename or address>"
    -> And then the the "java <main class name or address>"
*/

/*
NOTE: In starting you can use "jshell" for some line of codes in terminal or cmd.
        ex- using jshell we can just write and run system.out.print(), but we can't do that here.
*/


/*
!NOTE: if the main class is in public like "public class Intro" then the class name should be same as the filename.
!      and if the class is in private like "class Intro" then the file and class name could differ.
*/



class Intro{
    public static void main(String a[])
    {
        System.out.println("Hello World, From Java...");
        System.out.println(2+3);
    }
}

/*
MEANING OF THE CODE

-> public static void main(String args[])

public -> The JVM needs to be able to access the main() method from outside your class, so it must be public.
static -> Means the method belongs to the class itself, rather than requiring an object. So the java can run this without creating a object for that class.
void -> means the method doesn't return any value.
main -> it is the name of the method and also the JVM search for this method.
(String args[]) -> This is a parameter given to the main method so that The main method can receive an array of Strings.

*/



/*
NOTE:
-> Before diving into the actual java, just want to use these codes as they are help to keep the .class files in a separate folder from main. and give a clean code str.
   Run these commands in the terminal.
    Syntax: javac -d <location for bytecode file> <location of java file>
            java -cp <location of bytecode file> <filename> 

        javac -d bin src/01_Basics/Intro.java (file location from your terminal to the file.)
        java -cp bin Intro  (tell the location and filename of the bytecode in bin to JVM, searching for where the file which I have to execute.)

-d bin → destination for .class files
-cp bin → tells Java where to look for the compiled class



NOTE: For shortcut and Unformal use: To run program just type "java <filename or dest with extension .java>"

 */
