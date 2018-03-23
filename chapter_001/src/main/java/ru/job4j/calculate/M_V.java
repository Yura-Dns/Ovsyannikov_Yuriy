package ru.job4j.calculate;
/**
 * M_V (Maximum_value - Определение максимального значения)
 */
public class M_V {

    private int result;

    public void add(int first, int second) {
        int maxValue = 0;
        int[] m = new int [2];
        m[0]= first;
        m[1]=second;
        for (int i=0;i < m.length;i++) {
                if (maxValue < m[i])
                    maxValue = m[i];
        }
        this.result = maxValue;
    }

    public int max() {
        return this.result;
    }
}