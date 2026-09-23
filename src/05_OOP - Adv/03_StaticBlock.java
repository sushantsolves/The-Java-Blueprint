class Mobile{
    String brand;               //by default --> null
    int price;                  //by default --> 0
    static String name;  


    /* constructor */
    public Mobile(){      //Initializing value by default for the instance, so that whenever a new obj is created we have a default value for that.
        brand = "";
        price = 100;
        System.out.println("In normal constructor");        //run 2 times
    }


    /* Static Block */
    static{     //Now name can also be initialized with the common constructor, but it will get initialized everytime when a obj created, but with that static block, it will initialize only once.
        name = "Once";
        System.out.println("In static block");              //run 1 time
    }



    public void display(){
        System.out.println("Brand : "+brand + "\nPrice : " + price + "\nType : "+ name);
    }

}


class StaticBlock{
    public static void main(String[] args) throws classNotFoundException
    {
        

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // obj1.name = "SmartPhone";
        // obj1.display();
        
        // Mobile obj2 = new Mobile();
        // obj2.display();

        //? We commented the upper part as we are going to see is there any chance that if we don't create any object, still java loads the class loads
        Class.forName("Mobile");
    }
}