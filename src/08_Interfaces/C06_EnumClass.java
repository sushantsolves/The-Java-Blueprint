enum laptop{
    Macbook(2000), XPS(2200), Surface, Thinkpad(1800);        // Macbook -> obj, and (2000) -> constructor argument, so here we are passing the price of the laptop as a constructor argument.

    private int price;

    private laptop(){        //constructor of enum class, and it should be private.
        this.price = 000;        //default price of the laptop is 000 if we don't pass any price in the constructor.
    }

    private laptop(int price){        //constructor of enum class, and it should be private.
        this.price = price;
    }

    public int getPrice(){        //getter method to get the price of the laptop.
        return price;
    }
    
}


public class C06_EnumClass{
    public static void main(String a[]){

        Laptop lap = Laptop.Macbook;        //here we are creating a obj of Macbook, and assigning it to lap.
        System.out.println(lap + " : " + lap.getPrice());        //Macbook : 2000


        //To print all the enum objects and their price, we can use values() method of enum class, which returns an array of all the enum objects.
        for(Laptop l: Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}