class DataTypes{
    public static void main(String args[]){
        //! Java is a statically typed language, so herre we have to define the datatype as C or C++.

        byte a = 10;            //8 bits(1 byte) -> range from -128 to 127
        short b = 10000;        //16 bits(2 byte) -> range from -32,768 to 32,767
        int c = 45;             //32 bits(4 byte) -> range from -2,147,483,648 to 2,147,483,647
        long d = 50;            //64 bits(8 bytes) -> range from -2⁶³ to 2⁶³−1 

        float e = 3.48f;          //32 bits(4 bytes) -> ~±3.4 × 10³⁸ 
        double f = 3.1427745;    //64 bits(8 bytes) -> ±1.7 × 10³⁰⁸ 
        
        char g = 'A' ;            //16 bits(2 bytes) -> `0` to `65,535` 

        boolean h = true;




/*
| Data Type |                                Size | Range                           | Example                         |
| --------- | ----------------------------------: | ------------------------------- | ------------------------------- |
| `byte`    |                 **8 bits (1 byte)** | -128 to 127                     | `byte age = 20;`                |
| `short`   |               **16 bits (2 bytes)** | -32,768 to 32,767               | `short marks = 30000;`          |
| `int`     |               **32 bits (4 bytes)** | -2,147,483,648 to 2,147,483,647 | `int population = 1000000;`     |
| `long`    |               **64 bits (8 bytes)** | -2⁶³ to 2⁶³−1                   | `long distance = 10000000000L;` |
| `float`   |               **32 bits (4 bytes)** | ~±3.4 × 10³⁸                    | `float price = 99.5f;`          |
| `double`  |               **64 bits (8 bytes)** | ~±1.7 × 10³⁰⁸                   | `double pi = 3.14159;`          |
| `char`    |               **16 bits (2 bytes)** | `0` to `65,535`                 | `char grade = 'A';`             |
| `boolean` | **Not precisely specified by Java** | `true` / `false`                | `boolean pass = true;`          |
*/

        System.out.println(a);
        System.out.println(b);
        System.out.println("Hello World");
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}


/*
NOTE:
%s  → String
%d  → integer
%f  → floating-point
%.2f → floating-point with 2 decimal places
*/