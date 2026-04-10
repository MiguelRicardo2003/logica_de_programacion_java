package cursojava.Arreglos;

import javax.swing.JOptionPane;

/**
 * Crear un arreglo de tipo String con 8 nombres de paises, pedirselos al usuario por joptionPane y mostralos en
 * consola por medio de un bucle for each
 */
public class Arreglos1 {

    public static void main(String[] args) {
        
        String[] paises = new String[8];
        
        for(int i=0;i<paises.length;i++){
            paises[i] = JOptionPane.showInputDialog(null, "Por favor ingrese el nombre del pais: "+i);
        }
        
        for(String pais: paises){
            System.out.println("Paises del Arreglo: "+pais);
        }
    }
}
