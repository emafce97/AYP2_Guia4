package ejercicio3;

public class NoExisteElArchivo extends Exception{

    public NoExisteElArchivo(){
        super("No existe el archivo!");
    }
}
