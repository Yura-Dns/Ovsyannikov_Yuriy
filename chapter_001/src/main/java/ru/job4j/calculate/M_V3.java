package ru.job4j.calculate;
/**
 * M_V (Maximum_value - Определение максимального значения)
 */
public class M_V3 {
    private int temp;
    public int max(int first, int second, int third) {
        temp = first > second ? first : second;
        return temp > third ? temp : third;
    }
}