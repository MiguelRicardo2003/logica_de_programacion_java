package cursojava.Condicionales;

import javax.swing.JOptionPane;

public class Condicional1 {

    /* Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10*/
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el numero"));
        
        if(numero % 10 ==0){
            JOptionPane.showMessageDialog(null, "El numero "+ numero+" es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+ numero+" no es multiplo de 10");
        }
    }

}
