package cursojava.Bucles;

// Pedir numeros hasta que se introduzca uno negativo, y calcular la media

import java.util.Scanner;

public class Bucles2 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, suma=0, contador=0;
        float media;
        
        System.out.println("Por favor ingrese un numero");
        numero = entrada.nextInt();

        while(numero>=0){
            suma = suma+numero;
            contador ++;

            System.out.println("Por favor digite otro numero");
            numero = entrada.nextInt();
        }

        if(contador==0){
            System.out.println("Error!. La division entre cero no existe");
        }else{
            media = (float) suma / contador;
            System.out.println("programa finalizado....");
            System.out.println("La media de lo numeros ingresados es de: "+media);
        }

    }
}
