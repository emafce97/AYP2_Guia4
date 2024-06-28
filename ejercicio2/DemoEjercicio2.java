package ejercicio2;

public class DemoEjercicio2 {

    public static void main(String[] args){
        Examen e1 = null;
        Examen e2 = null;
        try{
            e1 = new Examen("27/06/24", "Emanuel Faillace", 12000, 6.5);
            e2 = new Examen("27/06/24", "Gabriel Faillace", 12000, -6.5);
        }catch(NumLegajoEx | ValorNotaEx ex){
            System.err.println(ex);
        }
    }
}
