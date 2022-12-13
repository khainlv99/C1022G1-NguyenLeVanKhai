package ss7_Abstract_Class_Interface.bai_tap.Resizeable;


public class Square extends Shape {
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

    public double getAreaSquare() {
        return this.edge * this.edge;
    }

    public void setAreaSquare(double areaSquare) {
        this.areaSquare = areaSquare;
    }


    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", areaSquare=" + areaSquare +
                '}';
    }

    public void resize(double percent) {
        System.out.println("Area square after: " + (this.getAreaSquare() + this.getAreaSquare() * percent / 100));
    }
}
