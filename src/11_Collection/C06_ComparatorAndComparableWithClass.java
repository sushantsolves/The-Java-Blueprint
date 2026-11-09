// Now if we have a collection, how can we sort it.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return this.name + " : " + this.age;
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
        System.out.println(students);

    //! Print all value one by one.
        for(Student s: students){       //print one by one
            System.out.println(s);
        }

    //! Sort according to age
        // Collections.sort(students, new Comparator<Student>(){       //anonymous class
        //     public int compare(Student s1, Student s2){
        //         if(s1.age > s2.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // });

        //* OR
        Comparator<Student> com = new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                if(s1.age > s2.age)
                    return 1;
                else
                    return -1;
            }
        }


        Collections.sort(students, com);
    }
}
