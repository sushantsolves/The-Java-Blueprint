import java.util.Scanner;           //Scanner is a pre-built Java class used to take input from the user, usually through the terminal.

public class Input {
    public static void main(String[] args) {

        // Scanner is used to take input from the user.
        /* 
        -> The path a input follows from your keyboard to the program.
            Keyboard
                ↓
            System.in
                ↓
            Scanner
                ↓
            Your Java program

            -> Also what that System.in: So it a reference which Create a Scanner that reads data coming from standard input (keyboard).
            */
        Scanner sc = new Scanner(System.in);


        // ============================================================
        // 1. Integer Input
        // ============================================================

        System.out.print("Enter your age: ");
        int age = sc.nextInt();                 //Read the next integer typed by the user.

        System.out.println("Your age is: " + age);


        // ============================================================
        // 2. Decimal Input
        // ============================================================

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("Your height is: " + height);


        // ============================================================
        // 3. Float Input
        // ============================================================

        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("Your percentage is: " + percentage);


        // ============================================================
        // 4. String Input - One Word
        // ============================================================

        System.out.print("Enter your first name: ");
        String firstName = sc.next();

        System.out.println("Hello, " + firstName);


        // ============================================================
        // 5. String Input - Full Line
        // ============================================================

        sc.nextLine(); // Clears the leftover newline.

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        System.out.println("Your full name is: " + fullName);


        // ============================================================
        // 6. Character Input
        // ============================================================

        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        System.out.println("You entered: " + character);


        // ============================================================
        // 7. Boolean Input
        // ============================================================

        System.out.print("Are you a student? (true/false): ");
        boolean student = sc.nextBoolean();

        System.out.println("Student: " + student);


        // ============================================================
        // Close Scanner
        // ============================================================

        sc.close();
    }
}