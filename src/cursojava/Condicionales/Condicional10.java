package cursojava.Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Pedir el dia, mes y año de una fecha, e indicar si la fecha es correcta. Con
 * meses de 28, 30 y 31 dias. Sin años bisiestos
 */
public class Condicional10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia, mes, anio;
        boolean fechaCorrecta = true;

        System.out.print("Introduce el día: ");
        dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        anio = sc.nextInt();

        // Comprobar mes
        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        } else {

            // Febrero (28 días)
            if (mes == 2) {
                if (dia < 1 || dia > 28) {
                    fechaCorrecta = false;
                }
            }

            // Meses de 30 días
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 1 || dia > 30) {
                    fechaCorrecta = false;
                }
            }

            // Meses de 31 días
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                    || mes == 8 || mes == 10 || mes == 12) {
                if (dia < 1 || dia > 31) {
                    fechaCorrecta = false;
                }
            }
        }

        if (fechaCorrecta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        sc.close();
    }
}
