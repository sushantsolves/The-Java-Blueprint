class Mutability{
    public static void main(String[] args){
        String name = "Sushant";
        name = name + " Raj";
        System.out.println("Hello " + name);        //OP: Hello Sushant Raj


        String s1 = "sushant";
        String s2 = "sushant";

        // So here comes a concept of mutable and Immutable:
        // NOTE: by default, strings are immutable.
        // Now to change it, and use it as mutable, we have things called String Buffer and String Builder.
    }
}