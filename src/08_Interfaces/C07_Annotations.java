/*
-> Annotations are a form of metadata that provide data about a program but are not part of the program itself. Annotations have no direct effect on the operation of the code they annotate.
-> Annotations can be read from source files, class files, or reflectively at run time. Annotations can be used by the compiler or by deployment tools and can also be examined at runtime.
-> Annotations can be used to provide information to the compiler, to generate code, or to configure frameworks
*/

@Deprecated     // A annotation of a class level -> means its a class and you can use it, but don't use it as it could be removed soon or there would be a good alternative for this.
class A{
    
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("This is class A");
    }
}

class B extends A{
    @Override
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("This is class B");
    }
}


public class C07_Annotations{
    public static void main(String a[]){
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();       //This is A class -> but why ?, now these are the called as Bugs -> when we expecting something else but the output is not acc to us.(means not compiler or run time its logical issue here.)
                                /*! For here, we have some changes in the class name of 's' in 'belongs' but what if we can ask our compiler the issue, as debugging can take a lot of time, here the annotations can help. there are some defined annotations in java for example: @Override, @Deprecated, @SuppressWarnings, etc */
    }
}