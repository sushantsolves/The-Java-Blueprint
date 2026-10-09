import tools.Calculator;
import tools.other.AdvancedCalculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        AdvancedCalculator advancedCalc = new AdvancedCalculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));

        System.out.println("Division: " + advancedCalc.divide(10, 5));
        System.out.println("Square: " + advancedCalc.square(5));
    }
}

/*
Folders --> packages
Files --> 

=============== POINTS =================
-> we have to use 'package <name>' to make a particular file as a part of package.
-> to use it at a place, we use "import <package_name>.<method_name>.<class_name>"
-> in case to import all the files of a package, just use " package name . * "




================ EXTRAS ================
->And one package can be a part of another package.
-> we generally put the main class outside of any package as to simply access it from outside.


*/







/*
! MVN REPOSITORY
--> WEBsite to get different repository or codes 



package com.google.calculator
--> a example to how to make a repo unique, as if you work in google you can use like this format 
*/