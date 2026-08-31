//local variable --> declared for a method or inside a method as role of parameters you can say.
//instance variable --> class variables, declared in class

class Calculator{
    int num = 7;

    public int add(int n1, int n2){
        System.out.println(n);
        return n1+n2;
    }
}

class StackAndHeap{
    public static void main(String[] arr){
        int data = 10;

        Calculator obj1 = new Calculator();
        int r1 = obj1.add(2,3);
        System.out.println(r1);

        Calculator obj2 = new Calculator();
        obj2.num = 8;
        
    }
}