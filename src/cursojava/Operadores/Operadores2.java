package cursojava.Operadores;

import java.util.Scanner;

public class Operadores2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioBase = 1000;
        double salarioTotal;
        double comision;
        double valorCarro;
        int numeroCarros;

        System.out.print("Por favor ingrese el valor del carro: ");
        valorCarro = entrada.nextDouble();

        System.out.print("Por favor ingrese la cantidad de carros vendidos en el mes: ");
        numeroCarros = entrada.nextInt();

        comision = (150 * numeroCarros) + (valorCarro * 0.05 * numeroCarros);
        salarioTotal = salarioBase + comision;

        System.out.println("El salario total del vendedor es de: $" + salarioTotal);

        entrada.close();
    }
}

