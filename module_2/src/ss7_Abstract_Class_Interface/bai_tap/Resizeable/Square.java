package ss7_Abstract_Class_Interface.bai_tap.Resizeable;


public class Square extends Rectangle implements IResizeable {
    private double edge;
    private double areaSquare;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getAreaSquare() {
        return this.edge * this.edge;
    }

    public void setAreaSquare(double areaSquare) {
        this.areaSquare = areaSquare;
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area square after: " + (this.getAreaSquare() + this.getAreaSquare() * percent / 100));
    }
}
