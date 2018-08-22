package ru.job4j.calculate;

public class Factorial {
    public int fL(int iFL) {
        int rFL = 1;
        if (iFL == 0){rFL=1;}
        else if (iFL>0) {
            int[] mass = new int[iFL];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = i + 1;
            }
            for (int i = 0; i < mass.length; i++) {
                rFL = rFL * mass[i];
            }
        }
        return rFL;
    }
}