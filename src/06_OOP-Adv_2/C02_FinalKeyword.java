/*
final keyword can be used with a variable, method and class.
    variable -> no can change teh value inside it
    class -> no one can extend the prop of it.
    method -> no method overriding can be done.
*/
//final class Calc
class Calc
{
    public final void show(){
        System.out.println("From Calc Show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

//but I want my class Calc to be separate and no one could inherit its prop.
class AdvCalc extends Calc
{
    // And I want any of my method to not to be overridden then we can use final as wer use in above class method.
    public void show(){
        System.out.println("From AdvCalc Show");
    }

}


public class C13_FinalKeyword{
    public static void main(String arg[]){
    /*FINAL VARIABLE

        we can create a variable and change its value right ?  
         int num = 8;
         num = 9;
         System.out.println(num);       //9

        But there is a concept of constants comes in every language 
         final int num = 8;
         num = 9;
         System.out.println(num);        //ERROR
    */


        
         Calc obj = new Calc();
         obj.show();
         obj.add(4,5);
    }
}