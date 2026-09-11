class strings{
    public static void main(String[] args){
        //In case to get or store a word or sentence, we can also use a character array. 

        //But here, String is a class in Java, as also its first letter is capital, so you can identify it.
                //But the structure, is not similar to other objects for class.

        String name = "Sushant";        //It is not the way we create other objects right ?, but it is a shortcut of -
        String name2 = new String("Raj");   //Thats what we are talking about.

        System.out.println(name);
        System.out.println(name2);



        //Keywords for string
        System.out.println(name.hashcode());

        System.out.println(name.charAt(2));

        System.out.println(name.concat(" Raj Sharma"));

    }
}