package cursojava.Arreglos;

import java.util.Random;

/*
Crear un programa que almacene 200 numeros aleatorios en un arreglo, y luego mostrar los 200 numeros en un bucle for each,
en consola
 */
public class Arreglos2 {

    public static void main(String[] args) {

        int[] aleatorios = new int[200];

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random() * 100);
        }

        for (int numero : aleatorios) {
            System.out.println("Numeros Aleatorios #: " + numero);
        }

    }
}
