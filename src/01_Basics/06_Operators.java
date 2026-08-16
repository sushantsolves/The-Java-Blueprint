class Operators {
    public static void main(String[] args) {

        // =========================================================
        // 1. ARITHMETIC OPERATORS
        // =========================================================

        int a = 10;
        int b = 3;

        System.out.println("=== Arithmetic Operators ===");

        System.out.println(a + b);   // 13  → Addition (+)
        System.out.println(a - b);   // 7   → Subtraction (-)
        System.out.println(a * b);   // 30  → Multiplication (*)
        System.out.println(a / b);   // 3   → Division (/)
        System.out.println(a % b);   // 1   → Modulus (%)


        // =========================================================
        // 2. UNARY OPERATORS
        // =========================================================

        int x = 5;

        System.out.println("\n=== Unary Operators ===");

        System.out.println(+x);      // 5   → Unary Plus (+) --> do nothing just indicates the value is +ve or -ve.
        System.out.println(-x);      // -5  → Unary Minus (-)

        System.out.println(++x);     // 6   → Pre-increment (++x)
        System.out.println(x++);     // 6   → Post-increment (x++)
        System.out.println(x);       // 7   → Value after post-increment

        System.out.println(--x);     // 6   → Pre-decrement (--x)
        System.out.println(x--);     // 6   → Post-decrement (x--)
        System.out.println(x);       // 5   → Value after post-decrement

        boolean flag = true;

        System.out.println(!flag);   // false → Logical NOT (!)


        // =========================================================
        // 3. RELATIONAL OPERATORS
        // =========================================================

        int p = 10;
        int q = 20;

        System.out.println("\n=== Relational Operators ===");

        System.out.println(p == q);  // false → Equal to (==)
        System.out.println(p != q);  // true  → Not equal to (!=)
        System.out.println(p > q);   // false → Greater than (>)
        System.out.println(p < q);   // true  → Less than (<)
        System.out.println(p >= q);  // false → Greater than or equal to (>=)
        System.out.println(p <= q);  // true  → Less than or equal to (<=)


        // =========================================================
        // 4. LOGICAL OPERATORS
        // =========================================================

        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\n=== Logical Operators ===");

        System.out.println(condition1 && condition2);
        // false → Logical AND (&&)

        System.out.println(condition1 || condition2);
        // true → Logical OR (||)

        System.out.println(!condition1);
        // false → Logical NOT (!)


        // =========================================================
        // 5. ASSIGNMENT OPERATORS
        // =========================================================

        int num = 10;

        System.out.println("\n=== Assignment Operators ===");

        System.out.println(num = 20);
        // 20 → Assignment (=)

        System.out.println(num += 5);
        // 25 → Add and assign (+=)

        System.out.println(num -= 5);
        // 20 → Subtract and assign (-=)

        System.out.println(num *= 2);
        // 40 → Multiply and assign (*=)

        System.out.println(num /= 4);
        // 10 → Divide and assign (/=)

        System.out.println(num %= 3);
        // 1 → Modulus and assign (%=)


        // =========================================================
        // 6. TERNARY OPERATOR
        // =========================================================
        // Syntx: variable = (condition) ? valueIfTrue : valueIfFalse;

        int age = 20;

        System.out.println("\n=== Ternary Operator ===");

        String result = (age >= 18) ? "Adult" : "Minor";
        //              <condition>  <true val> <false val>

        System.out.println(result);
        // Adult → Ternary operator (?:)


        // =========================================================
        // 7. BITWISE OPERATORS
        // =========================================================

        int m = 5;  // Binary: 0101
        int n = 3;  // Binary: 0011

        System.out.println("\n=== Bitwise Operators ===");

        System.out.println(m & n);
        // 1 → Bitwise AND (&)      -> 1 & 1 = 1  & Everything else = 0
        // 0101
        // 0011
        // ----
        // 0001 = 1

        System.out.println(m | n);
        // 7 → Bitwise OR (|)       -> 0 | 0 = 0 & Everything else = 1
        // 0101
        // 0011
        // ----
        // 0111 = 7

        System.out.println(m ^ n);
        // 6 → Bitwise XOR (^)      ->Same bits → 0  & Different bits → 1
        // 0101
        // 0011
        // ----
        // 0110 = 6

        System.out.println(~m);
        // -6 → Bitwise NOT (~)
        // "~n = -(n + 1)""  -> Easy formula to get it.
        // 0 → 1 & 1 → 0 (but the java operates in 32bit and its 1's complement is very complex and results in -6 here.)


        // =========================================================
        // 8. SHIFT OPERATORS
        // =========================================================

        int number = 8;

        System.out.println("\n=== Shift Operators ===");

        System.out.println(number << 1);
        // 16 → Left shift (<<)

        System.out.println(number >> 1);
        // 4 → Right shift (>>)

        System.out.println(number >>> 1);
        // 4 → Unsigned right shift (>>>)


        // =========================================================
        // 9. instanceof OPERATOR
        // =========================================================
        // -> instanceof is a Java operator used to check whether an object belongs to a particular class or type.
        String name = "Java";

        System.out.println("\n=== instanceof Operator ===");

        System.out.println(name instanceof String);
        // true → instanceof operator
    }
}