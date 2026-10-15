enum Status{
    Running, Failed, Pending, Success;  
}

public class C05_EnumIfAndSwitch{
    public static void main(String a[]){
        Status s = Status.Running;

        if(s == Status.Running){
            System.out.println("All Good");
        }else if(s == Status.Failed){
            System.out.println("Try Again");
        }else if(s == Status.Pending){
            System.out.println("Please Wait");
        }else if(s == Status.Success){
            System.out.println("Done");
        }

        switch(s){              //Switch come with some limitation, like it only works with primitive data types and enum objects, so we can't use it with String or any other data type.
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}