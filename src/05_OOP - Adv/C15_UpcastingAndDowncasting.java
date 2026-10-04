/* (Didn't get fully, go to chatgpt and clear it)
TypeCasting - we have done before
UpCasting -
DownCasting -
*/


class A{
    public void show1(){
        System.out.println("In A show");
    } 

}
class B extends A{
    public void show2(){
        System.out.println("In B show");
    }
}


public class C15_UpcastingAndDowncasting{
    public static void main(String args[]){

        A obj1 = new A();
        obj1.show();        //In A show


        A obj2 = new B();           /*reference of A, obj of B */
        obj2.show();


        System.out.println("UpCasting ---->");
        A obj3 = (A)new B();        /* Upcasting example -> going up, as A > B*/
        obj3.show1();       //can be called
        //obj.show2();        //can't be called


        System.out.println("DownCasting ---->");
        B obj4 = (B) obj1;          /* Downcating example */
        obj4.show2();       //can be called

    }
}