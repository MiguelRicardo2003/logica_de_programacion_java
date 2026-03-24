package cursojava.Bucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Una empresa que se dedica a la venta de desinfectantes necesita un programa
 * para gestionar las facturas. En cada factura figura: el código del articulo,
 * la cantidad vendida en litros y el precio por litro. Se pide 5 facturas
 * introducidas: Facturacion total, cantidad en litros vendidos del articulo 1 y
 * cuantas facturas se emitieron de mas de $600.
 */
public class Bucles12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int litros, litros_Articulo1 = 0, n_facturas = 0, codigo;
        float totalPagar = 0, subtotal = 0, precio;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el codigo del Articulo : "+i));
            litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad del Articulo "+i+" en litros: "));
            precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Por favor ingrese el precio del Articulo :"+i));

            if (codigo == 1) {
                litros_Articulo1 += litros;
            }

            subtotal = litros * precio;
            totalPagar += subtotal;

            if (totalPagar > 600) {
                n_facturas++;
            }
        }

        JOptionPane.showMessageDialog(null, "Total a pagar es de: $" + totalPagar + "\n"
                + "La cantidad de litros vendidos del articulo 1 es de: " + litros_Articulo1 + "\n"
                + "La cantidad de factura mayores a $600 es de: " + n_facturas, "RESUMEN DE VENTAS", JOptionPane.INFORMATION_MESSAGE);
    }
}
