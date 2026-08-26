class Outer{
    // public -> to make the method accessible for all
    // int -> to define the return type of this method
    // greet -> the method name we are going to use and call

    public int greet(){
        System.out.println("Hello! How are u doing ?");  //you can't stop the method here as you defined the return type as int
        return 0;
    }
}



class Classes{
    public static void main(String a[]){

        int num1 = 4;
        int num2 = 5;
        Outer  = new Calc();

        //Calculator.greet();                       //OP: Hello! How are u doing?
        System.out.println(Calculator.greet());     //OP: Hello! How are u doing?  0
    }
}