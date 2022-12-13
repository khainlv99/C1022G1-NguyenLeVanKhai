package ss7_Abstract_Class_Interface.bai_tap.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(5);
        shapes[1] = new Rectangle(3, 4);

        for (Shape element : shapes) {
            element.getArea();
            System.out.println(element.getName() + " Area " + " = " + element.getArea());
            if (element instanceof IColorable) {
                ((IColorable) element).howToColor();
                System.out.println("\n");
            }
        }
    }
}