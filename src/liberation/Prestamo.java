package liberation;

import java.util.Arrays;

public class Prestamo {
    private Libro[] L;
    private int ci;
    private int nroLibros;
    private String nombreLector;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(int ci, int nroLibros, String nombreLector, String fechaPrestamo, String fechaDevolucion) {
        L = new Libro[nroLibros];
        this.ci = ci;
        this.nroLibros = nroLibros;
        this.nombreLector = nombreLector;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo() {
    }

    public void mostrar() {
        String libros = "";
        for (int i = 0; i < nroLibros; i++) {
            libros += L[i].toString() + "\n";
        }
        String a = "";
        a += "Prestamo{\n" +
                "\tci=" + ci + "\n" +
                "\tnroLibros=" + nroLibros + "\n" +
                "\tnombreLector=" + nombreLector + "\n" +
                "\tfechaPrestamo=" + fechaPrestamo + "\n" +
                "\tfechaDevolucion=" + fechaDevolucion + "\n" +
                "\tLibros:" + "\n" +
                "\t\t" + libros + "\n" +
                "}";
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "L=" + Arrays.toString(L) +
                ", ci=" + ci +
                ", nroLibros=" + nroLibros +
                ", nombreLector='" + nombreLector + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                '}';
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
}
