package cursojava.Bucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Hacer unas modificaciones al ejercicio 12 anterior suponiendo que no se
 * introduce el precio por litro. Solo existen tres productos con precios: 1-0,6
 * $/litro 2-3 $/litro 3- 1,25 $/litro
 */
public class Bucles13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int litros, litros_Articulo1 = 0, n_facturas = 0, codigo;
        float totalPagar = 0, subtotal = 0;

        for (int i = 1; i <= 5; i++) {

            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el codigo de 1 a 3 del Articulo : " + i));
            } while (codigo < 1 || codigo > 3);

            litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad del Articulo " + i + " en litros: "));

            if (codigo == 1) {
                subtotal = (float) (litros * 0.6);
            } else if (codigo == 2) {
                subtotal = (float) (litros * 3);
            } else if (codigo == 3) {
                subtotal = (float) (litros * 1.25);
            } else {
                JOptionPane.showMessageDialog(null, "El codigo ingresado no esta en el rango de 1 a 3", "Rango no valido", JOptionPane.ERROR_MESSAGE);
            }

            totalPagar += subtotal;

            if (codigo == 1) {
                litros_Articulo1 += litros;
            }

            if (totalPagar > 600) {
                n_facturas++;
            }
        }

        JOptionPane.showMessageDialog(null, "Total a pagar es de: $" + totalPagar + "\n"
                + "La cantidad de litros vendidos del articulo 1 es de: " + litros_Articulo1 + "\n"
                + "La cantidad de factura mayores a $600 es de: " + n_facturas, "RESUMEN DE VENTAS", JOptionPane.INFORMATION_MESSAGE);
    }
}
