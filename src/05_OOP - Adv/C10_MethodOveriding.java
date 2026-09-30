class A{
    public void show(){
        System.out.println("In A show");
    }

    public void config(){
        System.out.println("In A config");
    }
}

class B extends A{
    public void show(){     //this show method in B overides the method in A.
        System.out.println("In B show");
    }
}


class MethodOveriding{
    public static void main(String arg[]){
        B obj = new B();
        obj.show();
        obj.config();
    }
}


/*
--> Even we can overides the method of different classes with each other, like Inheritance + MethodOveriding.
        ex - add method is also have with the AdvCalc instead of only with Calc, with same no of parameters, so the obj of AdvCalc will give priority to add method of its own class.
*/