package ss6_kethua.bai_tap.Circle;

public class Cylinder extends Circle {
    private int height;
    public Cylinder(){

    }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume(){
        return this.height*this.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() + "radius=" + super.getRadius() + "height=" + super.getColor()+ "volume="+ this.getVolume()+
                '}';
    }
}


