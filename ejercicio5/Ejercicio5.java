package ejercicio5;

import java.io.*;

public class Ejercicio5 {

    public static void reemplazar(String archivoOrigen, String archivoDestino, String palabraAReemplazar, String nuevaPalabra) throws IOException {
        FileReader fr = new FileReader(archivoOrigen);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(archivoDestino, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String linea : br.lines().toList()){
            bw.write(linea.replace(palabraAReemplazar, nuevaPalabra));
        }
        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}
