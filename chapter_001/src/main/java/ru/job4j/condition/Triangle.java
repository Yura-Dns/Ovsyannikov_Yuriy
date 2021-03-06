package ru.job4j.condition;

public class Triangle {
    private int x;
    private int y;
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double bc = this.b.distanceTo(this.c);
        double ca = this.c.distanceTo(this.a);
        double p = this.period(ab, bc, ca);
        if (this.exist(ab, bc, ca)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return rsl;
    }

    private boolean exist(double ab, double bc, double ca) {
        if (ab > 0 && bc > 0 && ca > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double period(double ab, double bc, double ca) {
        return (ab + bc + ca) / 2;
    }
}