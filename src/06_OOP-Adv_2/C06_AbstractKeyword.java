abstract class Car{             // a abstract method can only be define if the class is itself a abstract class
    public abstract void drive();       // we are making the drive method as abstract 
    public abstract void fly();

    public void playMusic(){
        System.out.println("play music");
    }
}

abstract class WagonR extends Car{
    public void drive(){            // any class which extends 'Car' then the child class have to define all the abstract methods of the parent class.
        System.out.println("Driving");
    }

    //But what if we only define drive but not fly() in WagonR, so in this scenario there will be error.
    // And to counter this issue, the WagonR class should also be declared as a abstract class.
}

class UpdateWagonR extends WagonR{          //! these are called Concrete Class. We can create obj of Concrete class not abstract classes.
    public void fly(){
        System.out.println("Flying");
    }
}





/*
NOTE: A abstract class can have both normal methods only, or all abstract or mix, but if a class has a abstract method then it will be a abstract class.
*/


public class C17_AbstractKeyword{
    public static void main(String args[]){

    }
}