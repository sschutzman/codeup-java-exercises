import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i);
//            System.out.print(" ");
//            i += 1;
//        }


//    Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000L);
//    }
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }
//        For
//
//        refactor the previous two exercises to use a for loop instead
//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);
//
//        for (int i = 1, i >= 10; i -= 5){
//            System.out.println(i);
//        }
//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("buzz");
//            } else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
//        Scanner sc = new Scanner(System.in);
//        boolean willContinue = true;
//        System.out.println("What number would you like to go up to?");
//        int userInt = sc.nextInt();
//        System.out.println("\nHERE IS YOUR TABLE");
//        System.out.println("\nnumber | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInt; i += 1){
////            System.out.print(i + "     |");
////            System.out.print(i * i + "    |");
////            System.out.print(i * i * i);
////            System.out.println("\n");
//            String output = "";
//            output += String.format("%-7d", i);
//            output += String.format("|%-9d", i *i);
//            output += String.format("|%d",i * i * i);
//            System.out.println(output);
//        }
//        System.out.println("\n Continue? [y/n]");
//        String userOption = sc.next();
//        if(userOption.equalsIgnoreCase("y") || userOption.equalsIgnoreCase("yes")){
//            willContinue = true;
//        } else{
//            willContinue = false;
//        }while(willContinue);
        Scanner sc = new Scanner(System.in);
        String userChoice;

        System.out.print("ENTER IN A NUMERIC GRADE: ");
        int gradeEntered = sc.nextInt();
        char letterGrade = ' ';

        if(gradeEntered >= 88) {
            letterGrade = 'A';
        }else if(gradeEntered >= 80){
            letterGrade = 'B';
        }else if(gradeEntered >= 67){
            letterGrade = 'C';
        }else if(gradeEntered >= 60){
            letterGrade = 'D';
        }else if(gradeEntered >= 0){
            letterGrade = 'F';
        }

        System.out.println(letterGrade);
        System.out.println("\n do you wish to continue? [y/n]");
        userChoice= sc.next();



    }
}
