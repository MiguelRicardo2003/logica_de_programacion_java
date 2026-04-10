
package cursojava.Arreglos;

import java.util.Scanner;

/**
 Mostrar Arreglos con For each
 */
public class Arreglos4 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int nElemento;
        
        System.out.println("Ingrese la cantidad de elementos del Arreglo: ");
        nElemento = entrada.nextInt();
        
        int[] edades = new int[nElemento];
        
        for(int i=0;i<edades.length;i++){
            System.out.println("Por favor ingrese la edad en la posicion: "+(i+1));
            edades[i] = entrada.nextInt();
        }
        
        System.out.println("Mostrando elementos del Arreglo edad: ");
        
        for(int edad:edades){
            System.out.print("["+edad+"]"+" ");
        }
    }
}
