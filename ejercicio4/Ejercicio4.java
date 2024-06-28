package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static int contarOraciones() throws SinDatosEx {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese un texto seperando cada oracion por un punto: ");
        String texto = scn.nextLine();
        String[] oraciones = texto.split("\\.");
        if (oraciones.length == 1) {
            throw new SinDatosEx();
        } else {
            return oraciones.length;
        }
    }
}
