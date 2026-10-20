@FunctionalInterface
interface A{
    int add(int a, int b);
}


public class C11_LambdaWithReturn{
    public static void main(String[] args) {
        // A obj = new A(){
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };


        A obj = (i, j) -> i+j;          //if we have one statemment to return just simply write i+j and it will considered as the return statement.
        int result = obj.add(5, 7);
        System.out.println("Result: " + result);
    }
}