/*
======================================================================
                    TYPE CONVERSION AND CASTING
======================================================================

--> Conversion has futher two types:
    1. Implicit Conversion - The conversion automatically done by the java. like a=b (int -> double)
    2. Explicit Conversion - The conversion which we have to done manually. like a=(int)b (double -> int)
 */
class TypeCasting{
    public static void main(String[] arr){
    
    //Case 1:Byte converted to integer easily. (Implicit Coversion)
        byte b = 127;
        int a = 256;
         //here b=a (not work)      -> as byte range is full
         //     a=b (will work)     --> Now this conversion is called as Implicit conversion.


    //Case 2: Manual type conversion. (Explicit Conversion)
        //But what for this case(both are in comman range):
        byte c = 123;
        int d = 12;

        c = (byte)d;    //! -> This conversion is a example of explicit conversion, which is also called as Casting.


    //Case 3: When int is out of range of byte
        int e = 258;
        byte f = (byte) e;
        System.out.println(f);      // 2 --> in case of out of range the byte will divide the int from the most least byte range. here that is 256 and 258/256 returns the remainder 2.


    //Case 4: 
        float g = 5.6f;
        int h = (int) g;            //5 --> we lost the point value.




    /*
    ===================================================
    TYPE PROMOTION
    ===================================================
    */

    byte n1 = 10;
    byte n2 = 30;
    int result = n1*n2;
    //-> this promotion is given bcz 300 is out of range, so byte*byte = int.

    }
}


/*
! Conversion: Generally refers to the implicit/ or the automatically conversions.
! Casting: Refers to where we have to manually write the conversion and define to and from data types.
*/