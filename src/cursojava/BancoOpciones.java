
package cursojava;

import java.util.Scanner;

public class BancoOpciones {
     public static void main(String[] args) {
         
         Scanner entrada = new Scanner(System.in);
       
         int opc;
         double saldoActual = 500, cantidad;
         char continuar;
         
         do{
             System.out.println("Bienvenidos a Bancolombia");
             System.out.println("Por favor Seleccione la Operación a realizar");
             System.out.println("1. CONSULTA DE SALDO \n2. DEPOSITO DE DINERO\n3. RETIRO DE DINERO\n4. SALIDA");
             opc = entrada.nextInt();
             
             switch(opc){
                 case 1:
                     System.out.println("Su saldo actual es de: "+ saldoActual);
                     break;
                 case 2:
                     System.out.println("Digite la cantidad de Dinero a depositar: ");
                     saldoActual = entrada.nextDouble() + saldoActual;
                     System.out.println("Dinero depositado correctamente");
                     System.out.println("Su saldo actual es de : $"+saldoActual);
                     break;
                 case 3:
                     System.out.println("Ingrese la cantidad de Dinero a Retirar");
                     cantidad=entrada.nextDouble();
                     
                     if(cantidad > saldoActual){
                         System.out.println("Saldo insuficiente, Su saldo actual es de : $"+ saldoActual);
                     }else{
                         saldoActual = saldoActual - cantidad;
                         System.out.println("Reiro realizado correctamente");
                     }
                     break;
                     
                 case 4:
                     System.out.println("Gracias por confiar en nosotros, hasta pronto ....");
                     break;
                default:
                    System.out.println("La opcion ingresada no existe en el menu......");
                    break;
                     
                     
             }
             
             System.out.println("Desea seguir realizando otra operación. S o s para confirmar y N o n para salir \n");
             continuar = entrada.next().charAt(0);
             
         }while(continuar == 'S' || continuar == 's');

    }
    
}
