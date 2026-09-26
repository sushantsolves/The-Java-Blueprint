class Human{
    private int age;
    private String name;

    /* Constructor --> here you don't specify the return type
                       the constructor name should be same as the class name
                       every time you create the obj, the constructor will called automatically. */
    public Human(){
        System.out.println("In constructor");   //we can pass any msg

        age = 12;       //we can set default values (follow the standards).
        name = "John";
    }

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