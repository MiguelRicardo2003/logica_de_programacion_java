package cursojava.Condicionales;

import javax.swing.JOptionPane;

/**
 * Construir un programa que simule el funcionamiento de una calculadora que
 * pueda realizar las cuatros operaciones basicas (suma, resta, multiplicación y
 * división), con valores númericos enteros. El usuario debe especificar la
 * operación con el primer carácter del primer parametro de la linea de
 * comandos: S o s para la suma, R o r para la resta, P,p,M, o m para la
 * multiplicacióny D o d para la divisón.
 */
public class Condicional11 {

    public static void main(String[] args) {

        char operacion;
        int num1, num2, resultado=0;
        boolean bandera= true;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el segundo número"));

        operacion = JOptionPane.showInputDialog(null, "Por favor ingrese la operacion a realizar: \n"
                + "S o s Suma\n"
                + "R o r Resta\n"
                + "P p M m Multiplicación\n"
                + "D o d División").charAt(0);

        switch (operacion) {
            case 'S':
            case 's':
                resultado = num1 + num2;
                break;
            case 'R':
            case 'r':
                resultado = num1 - num2;
                break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':
                resultado = num1 * num2;
                break;
            case 'D':
            case 'd':
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                    bandera = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opción ingresada no es válida");
                break;
        }

        if(bandera){
            JOptionPane.showMessageDialog(null, "El resultado de su operación es de: "+resultado);
        }

    }
}
