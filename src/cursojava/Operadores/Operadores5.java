
package cursojava.Operadores;

import java.util.Scanner;

public class Operadores5 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        
        float nHoras, semanas, dias, horas;
        
        System.out.println("Por favor ingrese el numero total de Horas");
        nHoras = entrada.nextInt();
        
        semanas = nHoras / 168;
        dias = (nHoras %168) / 24;
        horas = nHoras %24;
        
        System.out.println("Numero de semanas es de: "+ semanas);
        System.out.println("Numero de dias es de: "+ dias);
        System.out.println("Numero de horas es de: "+ horas);
        
        entrada.close();
    }
}
