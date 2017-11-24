import java.util.Scanner;

public class Bob {
    public static void main(String[] arg) {
        System.out.println("Say something to Bob.");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
//    Bob answers 'Sure.' if you ask him a question.
        boolean endsWithQuestionMark = userInput.endsWith("?");
//    He answers 'Whoa, chill out!' if you yell at him.
        boolean isYelling = userInput.equals(userInput.toUpperCase());
        boolean sayNothing = userInput.trim().isEmpty();

        if(endsWithQuestionMark){
            System.out.println("Sure.");
        }else if(sayNothing){
            System.out.println("Fine, I didn't care anyways");
        }else if(isYelling){
            System.out.println("Woah, chill out.");
        }else{
            System.out.println("Whatever");
        }
//
//
//
//    He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//    He answers 'Whatever.' to anything else.
    }
}
