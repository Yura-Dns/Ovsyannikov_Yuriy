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
        public void multiplication(double first, double seconds) {
        this.result = first * seconds;
    }
    public void division(double first, double seconds) {
        this.result = first / seconds;
    }
}