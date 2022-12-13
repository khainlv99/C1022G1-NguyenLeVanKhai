package ss7_Abstract_Class_Interface.bai_tap.Resizeable;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(4,1);
        shapes[2] = new Square(10);

        Circle circle = (Circle)shapes[0];
        System.out.println("Area circle before: "+circle.getArea());
        circle.resize(Math.floor(Math.random()*100+1));

        Rectangle rectangle = (Rectangle)shapes[1];
        System.out.println("Area circle before: "+rectangle.getArea());
        rectangle.resize(Math.floor(Math.random()*100+1));

        Square square = (Square)shapes[2];
        System.out.println("Area circle before: "+square.getAreaSquare());
        square.resize(Math.floor(Math.random()*100+1));

    }
}

