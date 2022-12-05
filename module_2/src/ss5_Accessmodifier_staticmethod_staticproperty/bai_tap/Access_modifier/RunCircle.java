package ss5_Accessmodifier_staticmethod_staticproperty.baitap.Access_modifier;

public class RunCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println("radius1: " + circle1.getRadius());
        System.out.println("area1: " + circle1.getArea() );
        System.out.println("radius2: " + circle2.getRadius());
        System.out.println("area2: " + circle2.getArea() );
    }
}
