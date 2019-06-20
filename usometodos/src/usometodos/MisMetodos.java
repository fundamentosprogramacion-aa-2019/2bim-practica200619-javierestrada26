
package usometodos;

/**
 *
 * @author javie
 */
public class MisMetodos {
    
    public static double obtenerPotencia(int base, int potencia){
        double valor =Math.pow(base, potencia);
        return valor;
    }
    public static void obtenerPotenciaDos(int b, int p){
        double valor =Math.pow(b, p);
        System.out.printf("\nEl valor de su operacion es %.2f", valor);
    }
    
}
