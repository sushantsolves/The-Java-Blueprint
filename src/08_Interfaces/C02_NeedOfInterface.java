/*
POV: you are a new developer joined a company and you need a new system to work on, so it could be a laptop or desktop. so what issue araise here and how to solve it, we'll discuss here.
*/

/*
class Computer{         //So as we creating this obj, we are not passing it, so if we only declaring it here we can also give it as abstract method --> means the class should also be abstract.
                        // and if both class and method is abstract then why don't we make it just as a interface.
    void code(){}
}
*/

interface computer{
    void code();
}


class laptop implements computer{
    public void code(){
        System.out.println("Coding in laptop");
    }
}

class Desktop implements computer{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}


class developer{
    //void coding(Compu lap){        //here the issue comes which we are talking about, so company give us both laptop or a desktop, as we simply need a computer to code right, but if we have a laptop then we can use it, but if we have a desktop then we can't use it, so here the issue comes. So to solve this we create a new class Computer.
    void coding(computer Com){
        Com.code();
    }
}



public class C02_NeedOfInterface{
    public static void main(String a[]){
        // laptop obj1 = new laptop();
        // Desktop obj2 = new Desktop();
        computer lap = new laptop();
        computer desk = new Desktop();

        developer dev = new developer();
        dev.coding(lap);        //Conding in laptop
        dev.coding(desk);       //Conding in Desktop
    }
}