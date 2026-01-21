package cursojava.Operadores;

import java.util.Scanner;

public class Operadores3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float participacion, primerExamen, segundoExamen, examenFinal, calificacionFinal;

        System.out.println(" Por favor Ingrese la nota de la participación");
        participacion = entrada.nextFloat();

        System.out.println(" Por favor Ingrese la nota del primer examen");
        primerExamen = entrada.nextFloat();

        System.out.println(" Por favor Ingrese la nota del segundo examen");
        segundoExamen = entrada.nextFloat();

        System.out.println(" Por favor Ingrese la nota del examen final");
        examenFinal = entrada.nextFloat();

        calificacionFinal = (participacion * 0.10f) + (primerExamen * 0.25f) + (segundoExamen * 0.25f) +(examenFinal * 0.40f);
        
        System.out.println("La calificación Final es de: "+ calificacionFinal);
        
        entrada.close();
    }
}
