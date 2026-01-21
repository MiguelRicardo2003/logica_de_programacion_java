package cursojava.Operadores;

import java.util.Scanner;

public class Operadores6 {

    /*ax2+bx+c=0  x=2a−b±b2−4ac*/

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a, b, c, x1, x2;
        System.out.print("Dividir el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Dividir el valor de b: ");
        b = entrada.nextDouble();
        System.out.print("Dividir el valor de c: ");
        c = entrada.nextDouble();
        x1 = (-(b) + (Math.sqrt((Math.pow(b, 2)) - 4 * (a) * (c)))) / (2 * (a));
        x2 = (-(b) - (Math.sqrt((Math.pow(b, 2)) - 4 * (a) * (c)))) / (2 * (a));
        System.out.println(x1);
        System.out.println(x2);

    }

}
