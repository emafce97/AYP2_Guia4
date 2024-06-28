package ejercicio3;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {

    public static int contarPalabras() throws ArregloVacioEx{
       Scanner scn = new Scanner(System.in);
       System.out.print("Ingrese las palabras que quiera (separadas por espacios):");
       String[] palabras = scn.nextLine().split(" ");
       int cantPalabras = palabras.length;
       if(cantPalabras == 1 && palabras[0].isEmpty()){
           throw new ArregloVacioEx();
       }else{
           return cantPalabras;
       }
    }

    public static int cuentaPalabrasEnArchivo(String nombreArchivo, String palabra) throws FileNotFoundException {
        FileReader fr = new FileReader(nombreArchivo);
        BufferedReader bf = new BufferedReader(fr);
        int contador = 0;
        for(String linea : bf.lines().toList()){
            String[] palabras = linea.split(" ");
            for(String p : palabras){
                if(p.equals(palabra)){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void escribirEnDisco(String nombreArchivo) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cadena de texto que quiera: ");
        String cadena = scn.nextLine();
        FileWriter fw = new FileWriter(nombreArchivo, true);
        fw.write(cadena);
        fw.close();
        scn.close();
    }
}
