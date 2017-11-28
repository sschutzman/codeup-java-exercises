package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();
        System.out.println("HELLO HUMAN ENTER A FEELING");
        String userFeeling = in.getString();
        System.out.println(userFeeling + "IS VERY SATISFACTORY");

//        boolean userInput = in.yesNo();
//        System.out.println("Do you like pie?");
//
//        if (userInput){
//            System.out.println("MMMmmmm pie");
//        } else {
//            System.out.println("Wow no pie?");
//        }

        System.out.println("PLEASE ENTER AN INTEGER HUMAN");
        int userInput = in.getInt();
        System.out.println("Integer is " + userInput);



    }
}
