class A{
    public A(){
        System.out.println("From constructor");
    }

    public void show(){
        System.out.println("In a show");
    }
}

class Demo{
    public static void main(String a[]){
        int marks;      // --> declaring
        marks = 90;     // --> assigning


        new A();        // --> this single line is known as anonymous object in java, and here the object is created in heap with no reference.
        new A().show();     //we can also use this, but issue is that we can use them only once. means if we write same line again, it will create a new object again


        // A obj = new A();
        A obj;          // --> now this is called as reference creation
        obj = new A();  // --> creating a object and assinging the value to obj.
                        // --> means when we write 'new A()', these two words create the obj, not the entire line. and writing only this is known as anonymous object as there is no name of this obj
        obj.show();
    }
}