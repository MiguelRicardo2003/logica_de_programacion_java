package cursojava.Condicionales;

import javax.swing.JOptionPane;

/**
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, suficiente,
 * bien, Notable y Sobresaliente
 */
public class Condicional12 {

    public static void main(String[] args) {

        double nota;

        nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese una nota de 0 a 10:"));

        if (nota >= 0 && nota < 3) {
            JOptionPane.showMessageDialog(null, "Su nota es Insuficiente");
        } else if (nota >= 3 && nota <= 5) {
            JOptionPane.showMessageDialog(null, "Su nota es Suficiente");
        } else if (nota > 5 && nota <= 7) {
            JOptionPane.showMessageDialog(null, "Su nota es Bien");
        } else if (nota > 7 && nota <= 9) {
            JOptionPane.showMessageDialog(null, "Su nota es Notable");
        } else if (nota > 9 && nota <= 10) {
            JOptionPane.showMessageDialog(null, "Su nota es Sobresaliente");
        } else {
            JOptionPane.showMessageDialog(null, "La nota ingresada no es valida !!!");
        }
    }

}
