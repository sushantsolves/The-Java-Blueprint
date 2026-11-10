// Now, why the Collections.sort() method is working with Integers but not with our classes, as the Integer Class in java implements to a class called Comparable, that's why they work.
// --> So now lets make our student class implements comparable.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Student implements Comparable<Student>{   //Comparable is an interface which is used to sort the collection of user defined class. and student is passing to the Comparable as they are the things through which we are comparing with.
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return this.name + " : " + this.age;
    }


    public int compareTo(Student s){      //compareTo is a method of Comparable interface which is used to compare the objects of user defined class.
        if(this.age > s.age)        //write login in here.
            return 1;
        else
            return -1;
    }
}


public class C06_ComparatorAndComparableWithClass {
    public static void main(String[] args){

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(23, "Navin"));
        students.add(new Student(21, "Harsh"));
        students.add(new Student(25, "Sushil"));
        students.add(new Student(19, "Sushant"));

    //! Print all value at once.
        Collections.sort(students);
    }
}

