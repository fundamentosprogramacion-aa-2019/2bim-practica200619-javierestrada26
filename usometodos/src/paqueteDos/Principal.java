
package paqueteDos;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la tabla");
        int valorA = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla ");
        int valorB = entrada.nextInt();
        Operacion.presentarTabla(valorA, valorB);
    }
}
