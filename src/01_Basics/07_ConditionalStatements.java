import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ============================================================
        // 1. if Statement
        // ============================================================

        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }


        // ============================================================
        // 2. if-else Statement
        // ============================================================

        int number = 7;

        if (number % 2 == 0) {              //One or more than one conditions can also be passed by using &&, || and ! (NOT)
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }


        // ============================================================
        // 3. if-else-if Ladder
        // ============================================================

        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }


        // ============================================================
        // 4. Nested if
        // ============================================================

        int userAge = 20;
        boolean hasID = true;

        if (userAge >= 18) {

            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("ID is required.");
            }

        } else {
            System.out.println("You are underage.");
        }


        // ============================================================
        // 5. Logical Operators with Conditions
        // ============================================================

        int studentMarks = 85;
        boolean attendance = true;

        if (studentMarks >= 40 && attendance) {
            System.out.println("Student passed.");
        }


        // ============================================================
        // 6. switch Statement
        // ============================================================

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }


        // ============================================================
        // 7. switch with String
        // ============================================================

        String language = "Java";

        switch (language) {
            case "Java":
                System.out.println("You selected Java.");
                break;

            case "Python":
                System.out.println("You selected Python.");
                break;

            case "C++":
                System.out.println("You selected C++.");
                break;

            default:
                System.out.println("Unknown language.");
        }


        sc.close();
    }
}