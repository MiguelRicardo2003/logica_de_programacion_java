package cursojava.Condicionales;

import javax.swing.JOptionPane;

/**
 * Hacer un programa que simule un cajero automatico con un saldo inicial de
 * 1000 Dolares. con el siguiente menú de opciones 1.Ingresar dinero a la cuenta
 * 2. Retirar dinero de la cuenta 3. Salir
 */
public class Condicional13 {

    public static void main(String[] args) {

        double saldoInicial = 1000, cantidadIngresar;
        int opc;

        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese la operación a realizar: \n"
                + "1. INGRESAR DINERO\n"
                + "2. RETIRAR DINERO\n"
                + "3. SALIR"));

        switch (opc) {
            case 1:
                cantidadIngresar = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad de dinero a depositar: $"));

                if (cantidadIngresar > 0) {
                    saldoInicial = saldoInicial + cantidadIngresar;

                    JOptionPane.showMessageDialog(null, "El Depositó se realizo correctamente: \n"
                            + "Su saldo final es de: $" + saldoInicial);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad ingresada es invalida");
                }
                break;

            case 2:
                cantidadIngresar = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad de dinero a retirar: $"));

                if (cantidadIngresar > 0 && cantidadIngresar <= saldoInicial) {
                    saldoInicial = saldoInicial - cantidadIngresar;

                    JOptionPane.showMessageDialog(null, "El retiro se realizo correctamente: \n"
                            + "Su saldo restante es de: $" + saldoInicial);
                }else if(cantidadIngresar <0){
                    JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad positiva para retirar");
                }else {
                    JOptionPane.showMessageDialog(null, "Actualmente no cuenta con esta cantidad para retirar");
                }
                break;

            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opcion ingresada no existe en el menú");
                break;
        }
    }
}
