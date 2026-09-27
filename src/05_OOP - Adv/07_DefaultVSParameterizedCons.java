class Human{
    private int age;
    private String name;

   /* Default or Normal Constructor */
   /* --> Why do we call this 'Default', as if you don't create any type of cons but the program still works bcz java make a constructor by itself like this, but there is nothing inside it. */
   public Human(){
        System.out.println("In constructor");   //we can pass any msg

        age = 12;       //we can set default values (follow the standards).
        name = "John";
    }

    /* Parameterized Constructor */
    public Human(int a, String n){
        age = a;        //Not the default value, we are passing
        name = n;
    }

    /*
    NOTE: now we can declare the object by two methods (with parameters or without parameters) */

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Constructor{
    public static void main(String a[]){
        Human obj = new Human();            // every single object created here is storing his storage in heap memory, as age= 0, and name = NULL. (try to print) 
        obj.setAge(age)
    }
}