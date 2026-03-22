package cursojava.Bucles;

import java.util.Scanner;

/**
 * Pedir un número y calcular su factorial N! = 1*2*3*4....N*
 */
public class Bucles7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.println("Por favor ingrese el numero para calcular su factorial: ");
        numero = entrada.nextInt();

        for (int i = numero; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("El factorial de :" + numero + " es de: " + factorial);
    }
}
