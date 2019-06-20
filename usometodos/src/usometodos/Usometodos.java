package usometodos;

public class Usometodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 2;
        double resutaldo = MisMetodos.obtenerPotencia(valor1, valor2);
        System.out.printf("El resultado es : %.2f", resutaldo);
        MisMetodos.obtenerPotenciaDos(valor1, valor2);
    }

}
