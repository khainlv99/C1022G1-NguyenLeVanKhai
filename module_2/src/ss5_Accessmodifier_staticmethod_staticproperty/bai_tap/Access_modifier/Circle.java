package ss5_Accessmodifier_staticmethod_staticproperty.baitap.Access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {

    }
    Circle(double r) {
        radius = r;
    }
    protected double getRadius() {
        return radius;
    }
    protected double getArea() {
        return this.radius*this.radius*3.14;
    }
}
