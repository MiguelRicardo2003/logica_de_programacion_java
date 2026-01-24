package cursojava.Condicionales;

import javax.swing.JOptionPane;

/**
 Pedir un número entre 0 y 99 999 y decir cúantas cifras tiene
 */
public class Condicional8 {

    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor Ingrese un número: "));
        
        if(numero < 10){
            JOptionPane.showMessageDialog(null, "El número tiene una sola cifra");
        }else if(numero >9 && numero <100){
             JOptionPane.showMessageDialog(null, "El número tiene dos cifras");
        }else if(numero > 99 && numero <1000){
            JOptionPane.showMessageDialog(null, "El número tiene tres cifras");
        }else if(numero > 999 && numero <10000){
            JOptionPane.showMessageDialog(null, "El número tiene cuatro cifras");
        }else if(numero > 9999 && numero <=99999){
            JOptionPane.showMessageDialog(null, "El número tiene 5 cifras");
        }else{
            JOptionPane.showMessageDialog(null, "Limite Excedido");
        }
        
        
    }
}
