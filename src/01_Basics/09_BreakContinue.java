public class BreakContinue {
    public static void main(String[] args) {

        // ============================================================
        // 1. break Statement
        // Stops the loop completely.
        // ============================================================

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println("break example: " + i);
        }


        // ============================================================
        // 2. continue Statement
        // Skips the current iteration.
        // ============================================================

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println("continue example: " + i);
        }


        // ============================================================
        // 3. break with while Loop
        // ============================================================

        int number = 1;

        while (number <= 10) {

            if (number == 7) {
                break;
            }

            System.out.println("while + break: " + number);
            number++;
        }


        // ============================================================
        // 4. continue with while Loop
        // ============================================================

        int n = 0;

        while (n < 10) {

            n++;

            if (n == 5) {
                continue;
            }

            System.out.println("while + continue: " + n);
        }


        // ============================================================
        // 5. break in Nested Loop
        // ============================================================

        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 5; col++) {

                if (col == 3) {
                    break;
                }

                System.out.print(col + " ");
            }

            System.out.println();
        }


        // ============================================================
        // 6. continue in Nested Loop
        // ============================================================

        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 5; col++) {

                if (col == 3) {
                    continue;
                }

                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}