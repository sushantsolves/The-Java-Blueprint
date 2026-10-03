/*
Object Class -> we have mentioned before that each class by default extends to ObjectClass, even if they didn't written "extends ObjectClass" but it exists.
*/

class Laptop{
    String model;
    int price;

    public String toString(){
        return "hey";
    }

    public boolean equals(Laptop other){    //here we take "other" just as a obj name as parameter, so that we can use 'this' keyword and "other" as object name.
        // if(this.model.equals(other.model) && this.price == other.price)
        //     return true;
        // else
        //     return false;

        return this.model.equals(other.model) && this.price == other.price;
    }
}


public class C14_ObjectClass{
    public static void main(String args[]){
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 1000;

        System.out.println(obj);                //OP: Laptop@34a4d23 
        System.out.println(obj.toString());     //OP: Laptop@34a4d23 
                                                // -> means both are returning same value, so .toString is by default with obj name.
                                                // -> Now what is it --> so def: (className + "@" + hashcode)


        /* But what if we made our own method for "toString" so that it work a kind of overridden, (with return "hey") */
        System.out.println(obj);                //OP: hey
        System.out.println(obj.toString());     //OP: hey
                //Also now we can customize "toString()" acc to our need as, (return name + " : " + model)



        /* Now lets create one more obj of laptop with same data and comapare themselves */
        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 1000;

        boolean result = obj.equals(obj2);

        /*
        System.out.println(result);     //OP: false
        -> Now it is giving us false as output, so lets create one of our own methods with same name "equals".
        */



    }
}