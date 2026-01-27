package cursojava.Bucles;

import java.util.Scanner;

/**
 Desarrolle un programa que genere un número aleatorio y permita al usuario intentar adivinarlo.
 El programa deberá indicar en cada intento si el número ingresado por el usuario es mayor o menor que el número generado.
 Cuando el usuario adivine correctamente, el programa deberá mostrar un mensaje de éxito e indicar la cantidad total de intentos realizados.
 */
public class Bucles1 {

    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int numeroCorrecto=0, cantIntentos=0;
        
        while(numeroCorrecto != numeroAleatorio){
            
            System.out.println("Por favor ingrese un número entre 1 y 100 para adivinar");
            numeroCorrecto = entrada.nextInt();
            
            if(numeroCorrecto > numeroAleatorio){
                System.out.println("El número es menor");
            }
            
            if(numeroCorrecto < numeroAleatorio){
                System.out.println("El número es mayor");
            }
            cantIntentos ++;
        }
        System.out.println("Succesfull.........");
        System.out.println("Haz adivinado el número Aleatorio que es el : "+ numeroAleatorio+ " Con un total de: "+cantIntentos+" intentos");

        entrada.close();
    }
}
