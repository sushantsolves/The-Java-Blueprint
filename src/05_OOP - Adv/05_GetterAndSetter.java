class Human{
    private String name;
    private int age;

    public void setName(String n){      //To set the value, from the user to the variable
        this.name = n;
    }

    public void setAge(int a){
        this.age = a;                   // this --> here 'this' is representing the current class, and this.age is saying that this age is that instance variable not a local variable of that method. 
    }


    public String getName(){            //To sent the private values to the user.
        return name;
    }

    public int getAge(){
        return age;
    }
}


class GetterAndSetter{
    public static void main(String[] args){

        Human h1 = new Human();
        h1.setName("Sushant");
        String h1name = h1.getName();

        h1.setAge(19);
        int h1age = h1.getAge();

        System.out.println("Name of the Human 1 = " + h1name);
        System.out.println("Age of the Human 1 = " + h1age);

    }
}