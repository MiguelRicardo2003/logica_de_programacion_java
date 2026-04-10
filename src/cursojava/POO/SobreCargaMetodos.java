package cursojava.POO;

public class SobreCargaMetodos {

    /*En Java, la sobrecarga permite que dos o más métodos tengan el mismo nombre, 
    siempre y cuando su lista de parámetros sea diferente (ya sea en cantidad o en tipo de dato).
     */
    public static void main(String[] args) {

        System.out.printf("El cuadrado del numero 7 es  %d \n ", cuadrado(7));
        System.out.printf("El cuadrado del numero 7.5  %.2f \n ", cuadrado(7.5));
    }

    public static int cuadrado(int valorInt) {
        return valorInt * valorInt;
    }

    public static double cuadrado(double valorDouble) {
        return valorDouble * valorDouble;
    }
}
