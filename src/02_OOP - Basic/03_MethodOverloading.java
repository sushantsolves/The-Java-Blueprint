//We have done the addition Program using the class method "add" previously but what about if we want to add 3 or 4 or more numbers.
class Calculator{

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){         //this method have same method but different parameters so the java will not give any error, one of them(name or para) should be diff, otherwise java will give error.
        return n1 + n2 + n3;                        //This process of different methods but same class name is called Method Overloading.
    }

    public double add(double n1, int n2, int n3){   //we can also change the dtype of para and return types. as here (double + int = double)
        return n1 + n2 + n3;
    }

}

class MethodOverloading{
    public static void main(String arr[]){
        Calculator calc = new Calculator();

        int r1 = calc.add(5,4);
        System.out.println("Result with 2 arguments: " + r1);       //Till here everything works normally.

        int r2 = calc.add(3,4,5);
        System.out.println("Result with 3 arguments: " + r2);       //Now here we passed 3 args but the first add accepts only 2. so the error comes is pasted below.
                                                                    //required: int,int
                                                                    //found:    int,int,int
                                                                    //reason: actual and formal argument lists differ in length
                                                                    //--> Now in order to get solution for it we can make diff methods with same name but diff arguments.

        double r3 = calc.add(3.5, 4,5);
        System.out.println("Result with 3 arguments but one dtype as double: " + r3);
    }
}