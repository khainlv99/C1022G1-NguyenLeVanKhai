package ss7_Abstract_Class_Interface.bai_tap.Colorable;

public class Rectangle extends Shape {
    private double height;
    private double width;
    private double areaRectangle;

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
        return areaRectangle;
    }

    public void areaCalculator() {
        areaRectangle = this.height * this.width;
    }
}
