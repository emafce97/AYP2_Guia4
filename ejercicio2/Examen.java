package ejercicio2;

public class Examen {

    private String fecha, nombreAlumno;
    private double nota;
    private int numLegajo;

    public Examen(String fecha, String nombreAlumno, int numLegajo, double nota) throws NumLegajoEx, ValorNotaEx {
        this.setNumLegajo(numLegajo);
        this.setNota(nota);
        this.fecha = fecha;
        this.nombreAlumno = nombreAlumno;
        this.numLegajo = numLegajo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setNumLegajo(int numLegajo) throws NumLegajoEx {
        if (numLegajo < 10000 || numLegajo > 15000) {
            throw new NumLegajoEx();
        }
        this.numLegajo = numLegajo;
    }

    public void setNota(double nota) throws ValorNotaEx {
        if (nota < 0 || nota > 10) {
            throw new ValorNotaEx();
        }
        this.nota = nota;
    }
}

