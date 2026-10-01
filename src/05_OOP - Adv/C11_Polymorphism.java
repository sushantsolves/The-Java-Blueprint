// POLYMORPHISM --> the same method name or reference can behave differently depending on the object/context.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}



class Polymorphism{
    public static void main(String arg[]){
        Animal a1 = new Dog();      // reference type is the parent (Animal), while the actual object is Dog.
        Animal a2 = new Cat();      // -> we can use the Dog and Cat as reference type but it didn't represennt as a polymorphism part.  (Parent reference + child object = runtime polymorphism)

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }
}

/*
Two types in Java:
Type	                    Achieved through	    Example
Compile-time polymorphism	Method overloading	    add(int,int) and add(int,int,int)
Runtime polymorphism	    Method overriding   	Animal a = new Dog()
*/



/*IMPORTANT POINTS TO REMEMBER

1. Overridden methods → runtime decision
    Animal a = new Dog();
    a.sound();

    Java looks at the actual object (Dog), so Dog.sound() runs.

    This is called dynamic method dispatch.


2. Reference type controls what you can access:
    For example: If Dog has:
                    void sound() { }
                    void run() { }

                and Animal only has:
                    void sound() { }

                then:
                    a.sound();   --> can be called.
                    a.run();     --> can't be called.
    Even though the actual object is a Dog, the Animal reference only exposes members available through Animal.



3.@Override is recommended
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    It tells the compiler:
    "I'm intentionally overriding a parent method."
    If we make a mistake in the method signature, Java catches it.



4.Fields don't behave like overridden methods
    This is a common beginner trap.
    Methods → runtime polymorphism
    Fields → reference type

    What are these fields and methods ?
    -> fields are variables declared inside a class that stores teh objects data/state.
        class Dog {
            String name;   // field
            int age;       // field

            void bark() {  // method
                System.out.println("Woof");
            }
        }
        */