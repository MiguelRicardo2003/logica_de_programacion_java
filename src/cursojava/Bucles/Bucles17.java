package cursojava.Bucles;

import java.util.Scanner;

/**
 * pedir 5 calificaciones de alumnos y decir al final si hay algún reprobado,
 * aprobado >=5 hasta 10, regular =4, reprobado<=3
 */
public class Bucles17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float calificacion;
        boolean reprobado = false;

        int i = 1;
        while (i < 6) {
            System.out.println("Por favor ingrese la nota del Alumno #" + i);
            calificacion = entrada.nextFloat();

            if (calificacion <= 3.0) {
                reprobado = true;
            }

            i++;
        }

        if (reprobado) {
            System.out.println("Si hay Alumnos qu reprobaron");
        } else {
            System.out.println("No hay Alumnos qu reprobaron");
        }

    }
}
