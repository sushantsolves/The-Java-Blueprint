class Calculator{
    //Using public as access specifiers
    // Method 1
    public String Greet(){              //return type of this method is String
        return "Hello";
    }
    // Method 2
    public int add(int n1, int n2){       //return type of this method is int
        return n1 + n2;
    }

    // Method 3
    public void Completed(){             //this method returns nothing
        System.out.println("Program Completed");
    }

}


class Methods{
    public static void main(String a[]){
        Calculator calc = new Calculator();         //In order to use class methods we need to make a object to call it.

        String g = calc.Greet();           //Simply called, no need to pass any argument or values.
        System.out.println(g);

        int result = calc.add(5,4);
        System.out.println("The sum of the numbers are: " + result);

        calc.Completed();
    }
}