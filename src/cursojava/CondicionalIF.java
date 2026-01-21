package cursojava;

import java.util.Scanner;

public class CondicionalIF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese su edad");
        int edad = entrada.nextInt();

        if (edad <= 14) {
            System.out.println("Eres un niño");
        } else if(edad >= 15 && edad <=25) {
            System.out.println("Eres adolescente");
        }else if(edad >=26 && edad <=40){
            System.out.println("Eres un Adulto");
        } else if(edad >=41 && edad<=60){
            System.out.println("Eres un Señor");
        }else{
            System.out.println("Eres un anciano");
        }
    }
}