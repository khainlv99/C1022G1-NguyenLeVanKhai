package ss7_Abstract_Class_Interface.bai_tap.Resizeable;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        circle.setRadius(7);
        System.out.println("Area circle before:" + circle.getArea());
        circle.resize(Math.floor(Math.random() * (100 - 1 + 1) + 1));
        rectangle.setLength(4);
        rectangle.setWidth(3);
        System.out.println("Area rectangle before:" + rectangle.getArea());
        rectangle.resize(Math.floor(Math.random() * (100 - 1 + 1) + 1));
        square.setEdge(4);
        System.out.println("Area square before:" + square.getAreaSquare());
        square.resize(Math.floor(Math.random() * (100 - 1 + 1) + 1));
    }
}

