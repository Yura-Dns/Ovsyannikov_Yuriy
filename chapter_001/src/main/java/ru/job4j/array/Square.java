package ru.job4j.array;

public class Square {

    public int[] form(int bond) {
        int[] mass = new int[bond];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * i;
        }
        return mass;
    }
}
