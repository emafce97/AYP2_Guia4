package ejercicio5;

import java.io.IOException;

import static ejercicio5.Ejercicio5.*;

public class DemoEjercicio5 {

    public static void main(String[] args){
        try {
            reemplazar("src/ejercicio5/origen.txt", "src/ejercicio5/destino.txt", "ema", "gaby");
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
