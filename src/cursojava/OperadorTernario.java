package cursojava;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese su edad");
        int edad = entrada.nextInt();

        String resultado = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println(resultado);
    }
}
