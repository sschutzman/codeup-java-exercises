import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input an integer");
        int userInt = sc.nextInt();

        System.out.println("HI, " + userInt + "! YOU ENTERED A NUMBER");
        System.out.println(userInt);


        System.out.println("Please enter in three words");
        String firstWord,secondWord,thirdWord;
        firstWord = sc.nextLine();
        secondWord = sc.nextLine();
        thirdWord = sc.nextLine();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        System.out.println("enter a sentence");
        String sentence = sc.nextLine();
        System.out.println(sentence);

        System.out.print("Please enter room length");
        String lengthString = sc.nextLine();
        System.out.println(lengthString);

        double length = Double.parseDouble(lengthString);

        System.out.println("Enter room length");
        String widthString = sc.nextLine();
        System.out.println(widthString);

        double width = Double.parseDouble(widthString);

        System.out.printf("The length is %d the with is %d", length, width);

        double area = width* length;
        double perimeter = width * 3 + length * 2;



        System.out.println(length);







    }

}
