//Example class which stores student variables
class Student{
    int rollno;     //Using instance variables instead of methods for now.
    String name;
    int marks;
}


class ArrObj{
    public static void main(String[] args){

        Student s1 = new Student();     //Simply creating a object of name 's1'
        s1.rollno = 1;
        s1.name = "Sushant";
        s1.marks = 97;

        Student s2 = new Student();     //Creating second example object
        s2.rollno = 2;
        s2.name = "Raj";
        s2.marks = 87;

        Student s3 = new Student();     //Creating third example object
        s3.rollno = 3;
        s3.name = "Vishal";
        s3.marks = 76;

        

        //Declaring a array of objects of size 3.
        //ex str --> int arr[] = new int[4];
        Student stud[] = new Student[3];

        stud[0] = s1;                   //assigning the values to the array.
        stud[1] = s2;
        stud[2] = s3;

        for(int i=0; i< stud.length; i++){
            //System.out.println(stud[i]);        //printing random values like --> Student@7ad041f3
            System.out.println(stud[i].name + " : " + stud[i].marks);
        }
    }
}