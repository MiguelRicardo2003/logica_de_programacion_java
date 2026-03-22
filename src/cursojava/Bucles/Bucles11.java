package cursojava.Bucles;

import java.util.Scanner;

/**
 * Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de
 * multiplicar de dicho número
 */
public class Bucles11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Por favor ingrese un número entre 0 y 10: ");
            numero = entrada.nextInt();
        } while (numero < 0 || numero > 10);

        System.out.println("TABLA DE MULTIPLICAR DEL " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
