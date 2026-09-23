//Encapsulation : public, private, protected, default

class Human{
    private int age = 19;           //after private, this variable is only accessible in this particular class and in this class methods only
    private String name = "Sushant";

    public int getAge(){
        return age;
    }


    public String getName(){
        return name;
    }



//Now we get how to get the value, but what about setting the value or assigning the value from outside ?

    private int age1;
    private String name1;

    public void SetAge1(int a1){
        age1 = a;
    }
    public void SetName1(String n){
        name1 = n;
    }


    public int getAge1(){
        return age1;
    }

    public String getName1;(){
        return name1;
    }

}

class Encapsulation{
    public static void main(String[] args){
        Human h1 = new Human();

        //h1.age = 11;      --> No Work
        //h1.name = "Raj";

        System.out.println(h1.getName + " : " + h1.getAge);


        //Now we get how to get the value, but what about setting the value or assigning the value from outside ?
        //h1.age1 = 20;       //not work
        h1.SetAge1(20);             //assigning values
        h1.SetName1("Raj");
        System.out.println(h1.getAge1);
        System.out.println(h1.getName1);

    }
}