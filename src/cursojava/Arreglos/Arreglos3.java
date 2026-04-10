
package cursojava.Arreglos;

import java.util.Scanner;

/**
Llenar un arreglo
 */
public class Arreglos3 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int nElementos;
        
        System.out.println("Por favor ingrese el numero de elementos del arreglo");
        nElementos = entrada.nextInt();
        
        int[] arreglo = new int[nElementos];
        
        for(int i=0; i<arreglo.length;i++){
            System.out.println("Ingrese el numero en la posicion "+i);
            arreglo[i]=entrada.nextInt();
            
        }
        
        System.out.println("Mostrando los elementos del Arreglo");
        
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
    }
}
