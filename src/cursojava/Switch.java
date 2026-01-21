
package cursojava;

import java.util.Scanner;

public class Switch {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

         /*System.out.println("Por favor ingrese el numero del mes a consultar");
         int mes = entrada.nextInt();

         switch(mes){
             case 1:
                 System.out.println("Enero");
                 break;
             case 2:
                 System.out.println("Febrero");
                 break;
             case 3:
                 System.out.println("Marzo");
                 break;
             case 4:
                 System.out.println("Abril");
                 break;
             case 5:
                 System.out.println("Mayo");
                 break;
             case 6:
                 System.out.println("Junio");
                 break;
             case 7:
                 System.out.println("Julio");
                 break;
             case 8:
                 System.out.println("Agosto");
                 break;
             case 9:
                 System.out.println("Septiembre");
                 break;
             case 10:
                 System.out.println("Octubre");
                 break;
             case 11:
                 System.out.println("Noviembre");
                 break;
             case 12:
                 System.out.println("Diciembre");
                 break;
             default:
                 System.out.println("La opcion ingresada no existe en el menú");
         }*/

         // Actualizacion switch desde java14

         /*String resultado = switch (mes){
             case 1->"Enero";
             case 2-> "Febrero";
             default -> "No existe en el menu";
         };
         System.out.println("Switch actualizado "+resultado);*/

         System.out.println("Por favor ingrese el dia a consultar");
         String dia_sem = entrada.nextLine();

         String dia_laborado = switch(dia_sem){
             case "Lunes","Martes","Miercoles","Jueves","Viernes" -> "Laborable";
             case "Sabado","Domingo" -> "Festivo";

             default ->{
                 System.out.println("Procesando ....");
                 /*se utiliza yield para que devuelva el valor aun habiendo varias lineas de codigo,
                 y realize el retorno a la variable dia_laborado*/
                 yield "Opcion no valida";
             }
         };
         System.out.println(dia_laborado);
    }
}
