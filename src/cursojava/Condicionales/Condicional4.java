package cursojava.Condicionales;

import javax.swing.JOptionPane;

public class Condicional4 {

    /* En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los $300.000 .
    ¿Cual será la cantidad que pagará una persona por su compra*/
    public static void main(String[] args) {
        
        double valorCompra;
        
        valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de la compra"));
        
        if(valorCompra > 300000){
            valorCompra = valorCompra - (valorCompra * 0.20);
            JOptionPane.showInternalMessageDialog(null, "El valor a pagar es de "+ valorCompra+" Gracias al descuento que otuvo del 20%");
        }else{
            JOptionPane.showInternalMessageDialog(null, "El valor a pagar es de "+ valorCompra);
        }
    }

}
