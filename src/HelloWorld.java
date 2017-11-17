public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 11;
        String myString = "That was my lucky number" + 's';
        double myNumber = 3.14159;

        int x = 5;

        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        // ++y is pre-incrementing
        System.out.println(++y);
        System.out.println(y);

        x = 4;
        // newValueForVariable = oldValueForVariable + 5;
        x += 5;

        x = 3;
        y = 4;
        //        new value for old var name = old value fro old var name *x
        y *= x;

        x = 10;
        y = 2;
        x /= y;
        y -= x;



//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        System.out.println(myNumber);
        System.out.println(myString);
        System.out.println(myFavoriteNumber);
        System.out.print("Hello, World!");
    }
}
