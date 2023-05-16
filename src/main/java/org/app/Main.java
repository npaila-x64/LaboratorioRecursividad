package org.app;

public class Main {
    public static void main(String[] args) {
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.imprimirCimas(new int[]{8,9,10,2,5,6});
        algoritmo.imprimirCimas(new int[]{8,9,10,12,15});
        algoritmo.imprimirCimas(new int[]{10,8,6,5,3,2});
        algoritmo.imprimirCimas(new int[]{9,2,5,3,12,6,7,8,1,2,2,6,16});
    }
}