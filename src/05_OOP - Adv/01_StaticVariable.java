class Mobile{
    String brand;       //Instance variables
    int price;
    static String name;     // we made the 'name' as a 'StaticVariable', to make is same for all the objects 

    //StaticVariable is shared by all the objects.
    // That's why, static variable can also be called by their class name ('Mobile.name'), not with only objects.

    //we can use StaticVariables in non static methods
    // And also it is called as a class variable, not a object variable

    public void display(){
        System.out.println("Brand : "+brand + "\nPrice : " + price + "\nType : "+ name);
    }
}


class StaticVariable{
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";
        obj1.display();

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";
        obj2.display();

        obj1.name = "Phone";        //This change of name will be implemented to both the objects
        obj1.display();
        obj2.display();
    }
}