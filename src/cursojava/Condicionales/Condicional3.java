package cursojava.Condicionales;

import javax.swing.JOptionPane;

public class Condicional3 {

    /* Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula*/
    
    public static void main(String[] args) {
        
        char letra;
        
        letra = JOptionPane.showInputDialog(null, "Ingrese el caracter a comprobar").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "El caracter es mayuscula");
        }else if(Character.isLowerCase(letra)){
            JOptionPane.showMessageDialog(null, "El caracter es minuscula");
        }else{
            JOptionPane.showMessageDialog(null, "El caracter ingresado no es valido");
        }
    }

}
