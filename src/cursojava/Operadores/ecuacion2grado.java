
package cursojava.Operadores;

import java.util.Scanner;


public class ecuacion2grado {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        double a, b, c, resultado1, resultado2
                ;
        System.out.println("Ingrese el valor de A");
        a = entrada.nextInt();
        
        System.out.println("Ingrese el valor de B");
        b = entrada.nextInt();
        
        System.out.println("Ingrese el valor de C");
        c = entrada.nextInt();
        
        resultado1 = ( -(b) + (Math.sqrt(Math.pow(b, 2) - (4 * (a)*(c))))) / (2 *(a));
        resultado2 = ( -(b) - (Math.sqrt(Math.pow(b, 2) - (4 * (a)*(c))))) / (2 *(a));
        
        System.out.println("El resultado con Negativo es de: "+ resultado1);
        System.out.println("El resultado con Positivo es de: "+ resultado2);
    }
}
