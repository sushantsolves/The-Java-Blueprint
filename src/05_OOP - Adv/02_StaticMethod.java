class Mobile{
    String brand;
    int price;
    static String name;    

    public void display(){
        System.out.println("Brand : "+brand + "\nPrice : " + price + "\nType : "+ name);
    }

    public static void show(){
        System.out.println("From static method show");
        //System.out.println("Brand : "+brand + "\nPrice : " + price + "\nType : "+ name);
        //                --> here name variable can be present (which is static), but 'brand' and 'name' can't be used as those are instance and can make confusion.
    }


    public static void show(Mobile obj){        // now we can use instance variables in a static method, as it is refering to a specific obj.
        System.out.println("From static method show");
        System.out.println("Brand : "+ obj.brand + "\nPrice : " + obj.price + "\nType : "+ name);
    }
}


class StaticMethod{
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

        obj1.name = "Phone";        
        obj1.display();
        obj2.display();

        //Mobile.display();     -->Not acceptable
        Mobile.show();      
    }
}