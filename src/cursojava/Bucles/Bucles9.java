package cursojava.Bucles;

import java.util.Scanner;

/**
 * Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1.000.
 */
public class Bucles9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float sueldo, sumaSueldo = 0;
        int cant_mayor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Por favor ingrese su sueldo #:" + i + " $: ");
            sueldo = entrada.nextFloat();

            sumaSueldo += sueldo;

            if (sueldo > 1000) {
                cant_mayor++;
            }

        }

        System.out.println("La suma de los 10 sueldos es de: $" + sumaSueldo);
        System.out.println("La cantidad de sueldos mayores a 1.000 es de: " + cant_mayor);
    }
}
