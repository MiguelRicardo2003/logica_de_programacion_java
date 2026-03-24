package cursojava.Bucles;

import java.util.Scanner;

/**
 * Dadas 6 notas de 0 a 10, escribir la cantidad de alumnos aprobados(>=5),
 * condicionados(=4) y reprobados(<=3)
 */
public class Bucles14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float nota;
        int aprobados = 0, condicionados = 0, reprobados = 0;

        for (int i = 1; i <= 6; i++) {

            do {
                System.out.println("Por favor ingrese la nota de 0 a 10 del Alumno: " + i);
                nota = entrada.nextFloat();
            } while (nota < 0 || nota > 10);

            if (nota >= 5.0) {
                aprobados++;
            } else if (nota == 4.0) {
                condicionados++;
            } else if (nota <= 3.0) {
                reprobados++;
            } else {
                System.out.println("La nota ingresada no existe...");
            }
        }

        System.out.println("La cantidad de alumnos aprobados es de: " + aprobados);
        System.out.println("La cantidad de alumnos condicionados es de: " + condicionados);
        System.out.println("La cantidad de alumnos reprobados es de: " + reprobados);

    }
}
