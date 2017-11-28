import java.util.Scanner;

public class MethodsExercises {
    public static void main( String args[] ) {
        System.out.println(addition(1, 2));
        System.out.println(subtraction(5, 3));
        System.out.println(multiplication(10, 2));
        System.out.println(division(49, 7));
        System.out.println(mod(100, 50));

        Scanner sc = new Scanner(System.in);
        userInteractionFactorial(sc);
    }

    //        Basic Arithmetic
    //
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
    public static double addition(double a, double b) {
        return a + b;
    }
//        Subtraction
    public static double subtraction(double a, double b){
        return a - b;
    }
//        Multiplication
    public static double multiplication(double a, double b){
        return a * b;
    }
//        Division
    public static double division(double a, double b){
        return a / b;
    }
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        Test your functions and verify the output.
//
//        Add a modulus function that finds the modulus of two numbers.
    public static double mod(double a, double b) {
      return a % b;
    }


    public static int getInteger(int min, int max) {
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextInt()) {
                    System.out.println("Not a number!");
                    return getInteger(min, max);
                }
            int userInput = sc.nextInt();
            if (userInput >= min && userInput <= max) {
                    return userInput;
                } else {
                    System.out.println("Number not in range!");
                    return getInteger(min, max);
                }
}

public static long calculateFactorial(int num) {
           int output = 1;
            for (int i = 1; i <= num; i += 1) {
        output *= i;
                }
           return output;
      }

            public static void userInteractionFactorial(Scanner sc) {
                boolean willContinue;
                String userChoice;
                do {
                    System.out.println("Please enter an integer from 1 to 12");
                    int userInt = getInteger(1, 12);
                    System.out.println(calculateFactorial(userInt));
                    do {
                        System.out.println("Do you wish to continue? [y/n]: ");
                        userChoice = sc.next().trim();
                    } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

                    willContinue = userChoice.equalsIgnoreCase("y");
                } while (willContinue);
            }
}








