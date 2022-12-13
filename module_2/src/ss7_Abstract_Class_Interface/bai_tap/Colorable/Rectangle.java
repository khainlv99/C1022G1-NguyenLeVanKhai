package ss7_Abstract_Class_Interface.bai_tap.Colorable;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", areaRectangle=" + getArea() +
                '}';
    }

    @Override
    public void howToColor() {

    }
}
