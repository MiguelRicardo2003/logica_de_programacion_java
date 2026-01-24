package cursojava.Condicionales;

import javax.swing.JOptionPane;

/**
 * Pedir el dia, mes y año de una fecha, e indicar si la fecha es correcta,
 * suponiendo que todos los meses son de 30 dias
 */
public class Condicional9 {

    public static void main(String[] args) {
        
        int dia, mes, anio;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el dia de la fecha: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el mes de la fecha: "));
        anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el año de la fecha: "));
        
        if(dia>0 && dia <=30){
            if(mes >0 && mes <=12){
                if(anio !=0){
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "Fecha Incorrecta, El año ingresado no es correcto ");
                }
            }else{
                 JOptionPane.showMessageDialog(null, "Fecha Incorrecto, El mes ingresado no es correcto ");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta, El dia ingresado no es correcto ");
        }
        
    }
}
