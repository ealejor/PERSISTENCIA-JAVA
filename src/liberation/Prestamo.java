package liberation;

import java.io.Serializable;

public class Prestamo implements Serializable {
    private Libro[] L;
    private int ci;
    private int nroLibros;
    private String nombreLector;
    private String fechaPrestamo;
    private String fechaDevolucion;

    private Lector lector;

    public Prestamo(Lector lector) {
        this.lector = lector;
        this.ci = lector.getCi();
        this.nombreLector = lector.getNombre();
    }

    @Override
    public String toString() {
        String libros = "";
        for (int i = 0; i < nroLibros; i++) {
            if (L[i] != null) {
                libros += L[i].toString() + "\n";
            }
        }
        String a = "";
        a += "Prestamo{\n" +
                "\tci=" + ci + "\n" +
                "\tnroLibros=" + nroLibros + "\n" +
                "\tnombreLector=" + nombreLector + "\n" +
                "\tfechaPrestamo=" + fechaPrestamo + "\n" +
                "\tfechaDevolucion=" + fechaDevolucion + "\n" +
                "\tLibros:" + "\n" +
                "\t\t" + libros +
                "}";
        return a;
    }

    public Libro[] getL() {
        return L;
    }

    public void setL(Libro l) {
        for (int i = 0; i < nroLibros; i++) {
            if (L[i] == null) {
                L[i] = l;
                break;
            }
        }
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getNroLibros() {
        return nroLibros;
    }

    public void setNroLibros(int nroLibros) {
        this.nroLibros = nroLibros;
        this.L = new Libro[nroLibros];
    }

    public String getNombreLector() {
        return nombreLector;
    }

    public void setNombreLector(String nombreLector) {
        this.nombreLector = nombreLector;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
}
