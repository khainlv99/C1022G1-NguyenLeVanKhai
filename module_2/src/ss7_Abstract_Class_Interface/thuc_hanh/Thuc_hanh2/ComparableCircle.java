package ss7_Abstract_Class_Interface.thuc_hanh.Thuc_hanh2;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {


    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
