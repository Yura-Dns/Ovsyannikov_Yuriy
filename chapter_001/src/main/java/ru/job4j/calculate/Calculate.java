package ru.job4j.calculate;

public class Calculate {
    private double result;

    public void add(double first, double seconds) {
        this.result = first + seconds;
    }

    public double getResult() {
        return this.result;
    }

    public void Minus(double first, double seconds) {
        this.result = first - seconds;
    }

    public double getResult2() {
        return this.result;
    }

    public void multiplication(double first, double seconds) {
        this.result = first * seconds;
    }

    public double getResult3() {
        return this.result;
    }

    public void division(double first, double seconds) {
        this.result = first / seconds;
    }

    public double getResult4() {
        return this.result;
    }
}