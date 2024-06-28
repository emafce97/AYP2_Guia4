package ejercicio4;

import static ejercicio4.Ejercicio4.contarOraciones;

public class DemoEjercicio4 {

    public static void main(String[] args){
        try{
            System.out.println(contarOraciones());
        }catch(SinDatosEx ex){
            System.err.println(ex.getMessage());
        }
    }
}
