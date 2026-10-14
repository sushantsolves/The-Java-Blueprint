/*

*/

enum Status{
    Running, Failed, Pending, Success;      //these are the enum objects, and by default they are public static final.
}

public class C04_Enum{
    public static void main(String a[]){
        int i = 5;
        Status s = Status.Running;      // its my running obj which is assigned to s here.
        System.out.println(s);
        System.out.println(Status.Failed);
        System.out.println(s.ordinal());    //ordinal() is a method which gives the index of the enum obj, so here Running is at 0th index, Failed is at 1st index and so on.


        Status[] ss = Status.values();      //values() is a method which gives the array of all the enum obj.
        for(Status s1: ss){
            System.out.println(s1 + " : " + s1.ordinal());
        }
    }
}