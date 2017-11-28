package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {

        sc = new Scanner(System.in);
    }

        public String getString(){
        return sc.nextLine();

        }

//        public boolean yesNo(){
//            String userInput = sc.next();
//            return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");


        public int getInt(){
            if (sc.hasNextInt()){
                return sc.nextInt();
            }else{
                System.out.println("NOT A VALID INTEGER");
                sc.next();
                return getInt();
            }

        }
//        public int getInt(int min, int max){
//            int userInput = getInt();
//            if (userInput >= min && userInput <= max){
//                return  userInput;
//            } else {
//                System.out.println("NOT IN RANGE");
//                return getInt(min,max);
//            }
//
//
//        }
//        public double getDouble(double min, double max){
//
//        }
//        public double getDouble(){
//
//        }
}

