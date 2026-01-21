package cursojava.Condicionales;

import javax.swing.JOptionPane;

public class Condicional5 {

    /*  Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
    Si trabaja 40 horas o menos se le paga $16 por hora
    Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra*/
    
    public static void main(String[] args) {
        
        int horasTrabajadas;
        float salarioSemanal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de horas trabajadas"));
        
        if(horasTrabajadas <= 40){
            salarioSemanal = horasTrabajadas * 16;
        }else{
            salarioSemanal = ((horasTrabajadas -40) * 20) + (40 * 16);
        }
        JOptionPane.showMessageDialog(null, "Su salario semanal es de: $"+salarioSemanal);
    }

}
