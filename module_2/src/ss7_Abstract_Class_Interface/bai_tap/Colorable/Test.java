package ss7_Abstract_Class_Interface.bai_tap.Colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(5);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Square(8);
        shapes[3] = new Rectangle(5, 12);

        for (Shape element : shapes) {
            element.areaCalculator();
            System.out.println(element.getName() + " Area " + " = " + element.getArea());
            if (element instanceof Colorable) {
                ((Colorable) element).howToColor();
                System.out.println("\n");
            }
        }
    }
}