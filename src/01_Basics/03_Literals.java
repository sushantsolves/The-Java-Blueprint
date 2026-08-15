//! Literals: the values/data stored in the variables.

class Literals{
    public static void main (String[] args){
    //* For integer
        int n1 = 5;
        int n2 = 0b101;     // 5 (binary to int)
        int n3 = 0x7E;      // 126 (Hexadecimal to int)

        int n4 = 1_00_00_000;       //10000000 -> to understand the number formatting better.
        // System.out.println(n4);

    
    //* For Double
        double n5 = 12e10;          //1.2 x 10^(11) similar to 2x10^(10)


    //* For Char 
        char a = 'A';
        a++;
        System.out.println(a);      //B -> a++ will increase it by one value.
    }

}

