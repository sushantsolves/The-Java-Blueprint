// NOTE: so we do have primitive datatypes in java like int, short, float, etc which makes java a 99.9% a object oriented lang as all of the java is not obj oriented, but there are some frameworks(collection,etc) of java which only work on classes, so thats where wrappers are introduced into java./

/*
!=========== WRAPPER CLASSES ==============
-> so for every primitive datatype we have a class
    int -> integer
    char -> Character
    double -> Double
    ...
*/


public class C16_WrapperClass{
    public static void main(String args[]){
        int num = 7;        //num -> primitive variable
        
        /*
        Integer num1 = new Integer(8);     //num1 -> reference variable

        System.out.println(num1);
        // “Your code uses something that Java has marked as deprecated.”
        // Deprecated = an old API that still works, but Java recommends that you stop using it because there is a newer/better alternative.
        //      --> the scene here, this method of assigning value has got old, it can still run but this is not a correct way, or java can stop it anytime.
        */
        //Then what to do to assign values ?
        Integer num2 = 9;   //simple as that
        System.out.println(num2);
        




        //! Boxing And Autoboxing
        Integer num3 = new Integer(num);    //boxing --> assigning a primitive variable to a reference variable
        Integer num4 = num;         //Autoboxing --> the same process but now it is done automatically.



        //! unboxing and auto-unboxing
        //? Also how to assign a reference variable to a primitive variable
        int n2 = num1.intValue();       //unboxing
        int n3 = num1;                  //Auto-unboxing
        System.out.println(n2);



        //NOTE: also you can get any datatype here as: doulbe, char, float, etc.



        String str = "12";
        int n4 = Integer.parseInt(str);     //! parseInt() -> to convert a string num value to integer.
        System.out.println(n4*4);
    }
}