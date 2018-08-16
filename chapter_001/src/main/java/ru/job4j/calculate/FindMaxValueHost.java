package ru.job4j.calculate;

public class FindMaxValueHost{
    public int maxValue(int first, int second, int third) {
        if (first > second) {return first;}
        else if (second > third){return second;}
        else {return third;}
    }
}