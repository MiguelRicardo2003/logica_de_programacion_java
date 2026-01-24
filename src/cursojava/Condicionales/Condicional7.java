package cursojava.Condicionales;

import javax.swing.JOptionPane;

public class Condicional7 {

    /* Pedir tres números y mostrarlos ordenados de mayor a menor*/
    public static void main(String[] args) {

        int num1, num2, num3, mayor;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el primer número"));

        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el segundo número"));

        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Favor ingrese el tercer número"));

        if ((num1 > num2) && (num2 > num3)) {
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: " + num1 + " " + " " + num2 + " " + num3);
        } else if ((num1 > num3) && (num3 > num2)) {
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: " + num1 + " " + " " + num3 + " " + num2);
        } else if ((num2 > num1) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: " + num2 + " " + " " + num1 + " " + num3);
        } else if ((num2 > num3) && (num3 > num1)) {
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: " + num2 + " " + " " + num3 + " " + num1);
        } else if ((num3 > num2) && (num2 > num1)) {
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: " + num3 + " " + " " + num2 + " " + num1);
        } else if ((num3 > num1) && (num1 > num2)) {
            JOptionPane.showMessageDialog(null, "El orden de los numeros es: " + num3 + " " + " " + num1 + " " + num2);
        }else{
            JOptionPane.showMessageDialog(null, "Ambos números son iguales");
        }
    }
}
