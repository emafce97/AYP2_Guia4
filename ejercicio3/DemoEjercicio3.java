package ejercicio3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoEjercicio3 {

    public static void main(String[] args){
        try{
            Ejercicio3.escribirEnDisco("src/ejercicio3/archivo.txt");
        }catch(FileNotFoundException ex){
            System.err.println(ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
