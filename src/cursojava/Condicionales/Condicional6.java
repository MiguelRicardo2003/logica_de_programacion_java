package cursojava.Condicionales;

import javax.swing.JOptionPane;

public class Condicional6 {

    /* Hacer un programa que tome 2 números y diga si ambos son pares o impares*/
    
    public static void main(String[] args) {

        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el primer número"));
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el segundo número"));
        
        if(num1 % 2 ==0 && num2 %2 ==0){
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
        }else{
             JOptionPane.showMessageDialog(null, "los números son impares");
        }
    }

}
