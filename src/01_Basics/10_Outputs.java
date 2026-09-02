class Outputs{
    public static void main(String[] args){
        /*You will use the three print statements most of the time for outputs.
            1. System.out.print()
            2. System.out.println()
            3. System.out.printf()
        */

    //!1. print()
        /*
        --> When you want the next output to appear on the same line.
            Example Program:
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            OP:-
            Enter your name: Sushant
        */

    
    //!2. println()
        /*
        --> It prints and then moves the cursor to the next line.
        --> We are going to use this most of the time.
            Exmaple Program:
            int age = 20;
            System.out.println("Age = " + age);

            OP:-
            Age = 20

        */



    
    //!3. printf()
        /*
        --> This is where formatting becomes powerful.
        --> printf = print formatted

        --> Formats         Meaning             Example
            %d              integer             85
            %f              decimal             85.54658
            %.2f            dec, 2 place        85.55
            %s              String              "Sushant"
            %c              char                'A'
            %b              boolean             True/False
            %n              new line            --


        --> Example Program:
            double avg = 85.666666;
            System.out.printf("%.2f", avg);         //NOTE: here we use ',' instead of '+' in brackets.

            OP:- 85.67


        --> Example Program2:
            String name = "Sushant";
            int total = 255;
            double average = 85.666666;
            char grade = 'A';

            System.out.printf(
                "Name: %s | Total: %d | Average: %.2f | Grade: %c%n",
                name, total, average, grade
            );


            OP:- Name: Sushant | Total: 255 | Average: 85.67 | Grade: A



       !--> Example Program3: you can make tables
            System.out.printf("%-15s %10s %n", "Subject", "Marks");             // Explanation:
            System.out.printf("%-15s %10d %n", "Java", 85);                        ->  ("%-15s  %10d") --> here part1 of 15 is for string and part2 for decimal.
            System.out.printf("%-15s %10d %n", "Math", 92);                        ->  '%'  --> format starts  
            System.out.printf("%-15s %10d %n", "Physics", 78);                     ->  '-'  --> left align, (by default it is right align as for decimal here.)  
                                                                                   ->  '15' --> the actual space which we are storing for the data.  
                                                                                   ->  's'  --> what type of data is coming here.                  
            OP:-
            Subject               Marks
            Java                     85
            Math                     92
            Physics                  78
        */





    

    /*
    NOTE:
    next() vs nextLine()
     ↓
    word vs complete line

    nextInt() + nextLine()
        ↓
    consume leftover newline

    hasNextInt()
        ↓
    validate before reading

    array + loop + nextInt()
        ↓
    standard DSA input pattern

    Scanner
        ↓
    easy & readable

    BufferedReader / fast input
        ↓
    large/competitive-programming input 
    */
    }
}