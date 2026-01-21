
package cursojava;
import javax.swing.*;

public class JoptionPane {
    public static void main(String[] args) {
       
        //La clase JoptionPane devuelve un String por ende cuandi se trabaje con int y double hay que parsear
        String nombre = JOptionPane.showInputDialog(null, "Por favor ingrese su nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese su edad"));
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su salario"));
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+ nombre+ " y su edad es: "+ edad);
    }
}
