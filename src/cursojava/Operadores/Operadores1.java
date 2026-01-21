package cursojava.Operadores;

import java.util.Scanner;

public class Operadores1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioGuillermo =0, salarioLuis=0, salarioJuan=0, total=0;

        System.out.println("Por favor ingrese n dolares de Guillermo");
        salarioGuillermo = entrada.nextDouble();

        salarioLuis = salarioGuillermo / 2;
        salarioJuan = (salarioLuis + salarioGuillermo) / 2;
        total = salarioGuillermo + salarioJuan + salarioLuis;

        System.out.println("el salario de Guillermo es "+salarioGuillermo);
        System.out.println("el salario de Luis es "+salarioLuis);
        System.out.println("el salario de Juan es "+salarioJuan);
        System.out.println("el total es "+total);

    }
}
