package shapes;
//Create a class named Square, also inside of shapes, that extends Rectangle
public class Square extends Rectangle {

    public int side;

//    Square should define a constructor
    public Square(int side){ //      Square accepts one argument, side
//    Square calls the parent's constructor to set both the length and width to the value of side.
        super(side, side);
        this.side = side;

    }
//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
    public int getArea(){
        return side ^ 2;
    }

    public int getPerimeter(){
        return 4 * side;
    }


}
