package org.app;

public class Algoritmo {
    private int[] arreglo;

    public void imprimirCimas(int[] arreglo) {
        this.arreglo = arreglo;

        System.out.print("Cimas encontradas: ");
        analisisRecursivoDeCima(0 , this.arreglo.length);
        System.out.println();
    }

    private void analisisRecursivoDeCima(int inicio, int fin) {
        if (inicio < fin) {
            int m = (inicio + fin) / 2;

            analisisRecursivoDeCima(inicio, m);
            analisisRecursivoDeCima(m + 1, fin);

            if (esElementoCima(m)) System.out.print(arreglo[m] + " ");
        }
    }

    private boolean esElementoCima(int m) {
        if (m == 0) { // caso extremo izquierdo
            return arreglo[m] > arreglo[1];
        } else if (m == arreglo.length - 1) { // caso extremo derecho
            return arreglo[m] > arreglo[arreglo.length - 2];
        } else {
            return arreglo[m] > arreglo[m - 1] && arreglo[m] > arreglo[m + 1];
        }
    }
}

