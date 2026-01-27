package cursojava.Condicionales;

import javax.swing.JOptionPane;

/**
 * Hacer un programa que pase de KG a otra unidad de medida de masa, mostrar en
 * pantalla un menú con las opciones posibles
 */
public class Condicional14 {

    public static void main(String[] args) {

        int opc;
        double cantidad, cantidadConvertida;

        opc = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la unidad a convertir, teniendo en cuenta que la unidad de medida base es Kilogramo:\n"
                + "1. KG a Gramo\n"
                + "2. KG a Tonelada\n"
                + "3. KG a Libra\n"
                + "4. KG a Onza\n"
                + "5. Salir"));

        if (opc == 5) {
            JOptionPane.showMessageDialog(null,"Programa Finalizado ......");
            return;
        } else {
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la cantidad de Kilogramos a convertir"));

            switch (opc) {
                case 1:
                    cantidadConvertida = cantidad * 1000;
                    JOptionPane.showMessageDialog(null, "La cantidda ingresada equivale a: " + cantidadConvertida + " Gramos");
                    break;
                case 2:
                    cantidadConvertida = cantidad / 1000;
                    JOptionPane.showMessageDialog(null, "La cantidda ingresada equivale a: " + cantidadConvertida + " Toneladas");
                    break;
                case 3:
                    cantidadConvertida = cantidad * 2.20462;
                    JOptionPane.showMessageDialog(null, "La cantidda ingresada equivale a: " + cantidadConvertida + " Libra");
                    break;
                case 4:
                    cantidadConvertida = cantidad * 35.274;
                    JOptionPane.showMessageDialog(null, "La cantidda ingresada equivale a: " + cantidadConvertida + " Onza");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error !! La opción ingresada no existe en el menú...");
                    break;
            }
        }

    }
}
