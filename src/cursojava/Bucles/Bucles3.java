package cursojava.Bucles;

//Pedir Número N, y mostrar todos los números del 1 al N

import javax.swing.JOptionPane;

public class Bucles3 {
    
    public static void main (String[] args){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el numero"));

        for(int i=1;i<=numero;i++){
            System.out.println("numero: "+i);
        }
    }
}
