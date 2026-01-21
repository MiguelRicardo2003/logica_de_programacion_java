package cursojava.Condicionales;

import javax.swing.JOptionPane;

public class Condicional2 {

    /* Pedir dos números y decir cual es el mayor o si son iguales*/
    public static void main(String[] args) {
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "El numero 1 es el mayor");
        }else if(num2 > num1){
            JOptionPane.showMessageDialog(null, "El numero 2 es el mayor");
        }else{
            JOptionPane.showMessageDialog(null, "Ambos números son iguales");
        }
    }

}
