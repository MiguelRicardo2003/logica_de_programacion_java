package cursojava.Bucles;

import java.util.Scanner;

/**
 * Pedir 10 números, y mostrar al final si se ha introducido alguno negativo
 */
public class Bucles16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        boolean negativo=false;
        
        for(int i=1;i<=10;i++){
            System.out.println("Por favor ingrese el numero:"+i);
            numero = entrada.nextInt();
            
            if(numero <0){
                negativo= true;
            }
        }
        
        if(negativo){
            System.out.println("Si se introducieron números negativos");
        }else{
            System.out.println("No se introducieron números negativos");
        }
    }
}
