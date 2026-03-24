
package cursojava.Bucles;

import java.util.Scanner;

/**
 Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
 */
public class Bucles15 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        float sueldo, sueldomaximo=0;
        
        System.out.println("Por favor ingrese un Número cualquiera: ");
        numero = entrada.nextInt();
        
        for(int i=1;i<=numero;i++){
            System.out.println("Por favor ingrese el sueldo #"+i+" $");
            sueldo = entrada.nextFloat();
            
            if(sueldo> sueldomaximo){
                sueldomaximo = sueldo;
            }
        }
        
        System.out.println("El sueldo maximo es de :$"+sueldomaximo);
    }
}
