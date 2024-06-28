package ejercicio1;

public class Ejercicio1 {

    /**
     * Se suma todos los valores numericos de una cadena de Strings
     * @param elementos
     * @return
     * @throws CastingLetraEx
     */
    public static int sumar(String[] elementos) throws CastingLetraEx{
        int suma = 0;
        for(String e : elementos){
            try {
                suma += Integer.parseInt(e);
            }catch (NumberFormatException ex){
                throw new CastingLetraEx();
            }
        }
        return suma;
    }

    public static void main(String[] args){
        String[] elementos = {"1","a","b","2"};
        try{
            System.out.println(sumar(elementos));
        }catch (CastingLetraEx e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Esto se imprime siempre!");
        }
    }
}
