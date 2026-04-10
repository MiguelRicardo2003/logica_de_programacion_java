package cursojava.Arreglos;

import java.util.Scanner;

/**
 * Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden
 * introducido
 */
public class Arreglos5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int [] numeros = new int[5];
        
        System.out.println("Leyendo los elementos del Arreglo");
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Por favor ingrese el numero en la posicion: ["+(i+1)+"]");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("Mostrando los elementos del Arreglo");
        for(int num:numeros){
            System.out.print("["+num+"]");
        }
    }
}
