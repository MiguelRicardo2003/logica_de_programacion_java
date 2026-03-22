package cursojava.Bucles;

import java.util.Scanner;

/**
 * Dadas las edades y alturas de 5 alumnos, Mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
 * mas de 1.75.
 */
public class Bucles10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad, cant_mayores18 = 0, cant_miden = 0;
        float estatura, estatuta_media = 0, edad_media = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Por favor ingrese la edad del alumno #:" + i);
            edad = entrada.nextInt();

            System.out.println("Por favor ingrese la estatura del alumno #:" + i);
            estatura = entrada.nextFloat();

            if (edad > 18) {
                cant_mayores18++;
            }
            if (estatura > 1.75) {
                cant_miden++;
            }

            edad_media += edad;
            estatuta_media += estatura;

        }

        if (estatuta_media == 0) {
            System.out.println("!No se puede sacar la media");
        } else {
            estatuta_media /= 5;
            System.out.println("La estatura media es de: " + estatuta_media);
        }

        if (edad_media == 0) {
            System.out.println("!No se puede sacar la media de la edad");
        } else {
            edad_media /= 5;
            System.out.println("La edad media es de: " + edad_media);
        }

        System.out.println("La cantidad de alumnos mayores de 18 años es de: " + cant_mayores18);
        System.out.println("La cantidad de alumnos que miden mas de 1.75 es de: " + cant_miden);
    }
}
