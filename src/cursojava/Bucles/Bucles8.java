package cursojava.Bucles;

import java.util.Scanner;

/**
 * Pedir 10 números. Mostrar la media de los números positivos, la media de los
 * números negativos y la cantidad de ceros
 */
public class Bucles8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, cant_Ceros = 0, contadorPositivo = 0, contadorNegativo = 0;
        float mediaPositivo = 0, mediaNegativo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Por favor ingrese el numero " + i + " :");
            numero = entrada.nextInt();

            if (numero > 0) {
                mediaPositivo += numero;
                contadorPositivo++;
            } else if (numero < 0) {
                mediaNegativo += numero;
                contadorNegativo++;
            } else {
                cant_Ceros++;
            }
        }

        //Verificamos que el contador de positivos y negativos sea diferente de cero
        if(contadorPositivo ==0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        }else{
            mediaPositivo /= contadorPositivo;
            System.out.println("La media de los numeros positivos es de: " + mediaPositivo);
        }

        if(contadorNegativo ==0){
            System.out.println("No se puede sacar la media de los numeros negativos");
        }else{
            mediaNegativo /= contadorNegativo;
            System.out.println("La media de los numeros negativos es de: " + mediaNegativo);
        }
       
        System.out.println("La cantidad de ceros ingresados es de: " + cant_Ceros);
    }
}
