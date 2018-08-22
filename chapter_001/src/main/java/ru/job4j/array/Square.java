package ru.job4j.array;

public class Square {
    public int res;
    public void form(int bond, int ind){
        int[] mass = new int[bond];
        for (int i=0; i<mass.length; i++){
            mass[i] = i*i;
            this.res= mass[ind];
        }
    }
    public double oRes() {return this.res;}
}