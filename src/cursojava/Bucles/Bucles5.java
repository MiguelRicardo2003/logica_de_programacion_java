package cursojava.Bucles;

import java.util.Scanner;

/**
 * Pedir 10 Números y escribir la suma total
 */
public class Bucles5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, suma=0;
        
        for(int i=1;i<=10;i++){
            System.out.println("Por favor ingrese el numero");
            numero = entrada.nextInt();
            
            suma+=numero;
        }
        
        System.out.println("La suma es :"+suma);
    }
}
