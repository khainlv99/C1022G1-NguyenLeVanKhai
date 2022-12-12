package ss7_Abstract_Class_Interface.bai_tap.Colorable;

public class Square extends Shape implements Colorable {
    private double edge;
    private double areaSquare;

    public Square() {

    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return areaSquare;
    }

    @Override
    public void areaCalculator() {
        areaSquare = this.edge * this.edge;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
