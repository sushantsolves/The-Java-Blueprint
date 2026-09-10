//Using the previous code as example for the Enhanced for loop.
class Student{
    int rollno;     
    String name;
    int marks;
}

class EnhancedForLoop{
    public static void main(String[] args){
        //With the previous for loop method as we know all the length and things but still we need to declare and use a variable 'i' to iterate ?
        //To solve this, we can use this Enhanced For Loop in case of arrays and Collections(Discussed Later).

        /*
        SYNTAX:
        for(int n: nums){       //means iterate over the array nums and give one value at a time, and for each iteration store value in 'n'. As you can perform operations with n.
            System.out.println(n);
        }
        */



        //Using the previous code as Example
        Student s1 = new Student(); 
        s1.rollno = 1;
        s1.name = "Sushant";
        s1.marks = 97;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Raj";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Vishal";
        s3.marks = 76;

        Student stud[] = new Student[3];
        stud[0] = s1;                   //assigning the values to the array.
        stud[1] = s2;
        stud[2] = s3;


        //Now using the Enhanced for loop
        for(Student n: stud){
            System.out.println(n.name + " : " + n.marks);
        }
    }
}