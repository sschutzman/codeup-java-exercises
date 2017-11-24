import java.util.Scanner;

public class MethodsExercises {
    public static void main( String args[] ) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(5, 3));
        System.out.println(multiplication(10, 2));
        System.out.println(division(49, 7));
        System.out.println(mod(100, 50));
    }

    //        Basic Arithmetic
    //
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
    public static int addition(int a, int b) {
        return a + b;
    }
//        Subtraction
    public static int subtraction(int a, int b){
        return a - b;
    }
//        Multiplication
    public static int multiplication(int a, int b){
        return a * b;
    }
//        Division
    public static int division(int a, int b){
        return a / b;
    }
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        Test your functions and verify the output.
//
//        Add a modulus function that finds the modulus of two numbers.
    public static double mod(int a, int b){
        return a % b;
    }

}class FactorialExample{
    public static void main(String args[]){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}






