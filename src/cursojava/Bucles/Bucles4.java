package cursojava.Bucles;

import javax.swing.JOptionPane;

/**
 * Escribir todos los números del 100 al 0 de 7 en 7
 */
public class Bucles4 {

    public static void main(String[] args) {

        for (int i = 100; i >= 0; i-=7) {
            System.out.println("numero: " + i);
        }
    }
}
