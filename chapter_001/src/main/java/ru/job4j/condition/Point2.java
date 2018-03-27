package ru.job4j.condition;

public class Point2 {
    private int x;
    private int y;

    public static void main(String[] args) {
        Point2 a = new Point2(0, 0);
        Point2 b = new Point2(2, 2);
        Point2 c = new Point2(2, 0);
        System.out.println("a[" + a.x + ";" + a.y + "]" + " " + "b[" + b.x + ";" + b.y + "]" + " " + "c[" + c.x + ";" + c.y + "]");
        double A = a.distanceTo(b);
        double B = b.distanceTo(c);
        double C = c.distanceTo(a);
        System.out.println("Расстояние между точками a и b = " + A);
        System.out.println("Расстояние между точками b и c = " + B);
        System.out.println("Расстояние между точками c и a = " + C);
    }
    public double distanceTo(Point2 that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}