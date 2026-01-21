
package cursojava.Operadores;

import java.util.Scanner;

public class Operadores4 {

    public static void main(String[] args) {

        /* Hacer un programa que calcule el cuadrado de una suma */
       
        Scanner entrada = new Scanner (System.in);
        
        double a, b, sumaCuadrado;
        
        System.out.println("Por favor ingrese el valor de A: ");
        a = entrada.nextDouble();
        
        System.out.println("Por favor ingrese el valor de B: ");
        b = entrada.nextDouble();
        
        sumaCuadrado = Math.pow(a, 2) + Math.pow(b,2) + (2 * a * b);
        
        System.out.println("La suma del cuadrado es: "+ sumaCuadrado);
    }
}
