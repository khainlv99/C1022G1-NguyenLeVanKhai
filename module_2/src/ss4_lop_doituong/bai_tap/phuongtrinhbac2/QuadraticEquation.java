package ss4_lop_doituong.bai_tap.phuongtrinhbac2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {

        return this.b * 2 - 4 * this.a * this.c;
    }

    public double getRoot1() {

        return (-this.b + Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {

        return (-this.b - Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5)) / (2 * this.a);
    }
}
