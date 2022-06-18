package liberation;

import java.io.Serializable;
import java.net.PortUnreachableException;
import java.util.Scanner;

public class Reserva implements Serializable {

    private int ci;
    private String nombreLector;

    private String fechaPrestamo;

    private int nroLibros;
    private Libro[] L;

    private Lector lector;

    public Reserva(Lector lector, String fechaPrestamo, int nroLibros) {
        this.lector = lector;
        this.ci = lector.getCi();
        this.nombreLector = lector.getNombre();
        this.fechaPrestamo = fechaPrestamo;
        this.nroLibros = nroLibros;
    }

    public Reserva() {
    }

    public void leer(Scanner scanner) {
        System.out.println("------ RESERVAS DEL LECTOR ------");
        System.out.print("Ingrese la fecha de préstamo: ");
        this.fechaPrestamo = scanner.next();
        System.out.print("Ingrese la cantidad de libros a prestarse: ");
        this.nroLibros = scanner.nextInt();

        this.L = new Libro[this.nroLibros];
        Libro l = new Libro();
        for (int i = 0; i < nroLibros; i++) {
            System.out.println("LIBRO " + (i + 1));
            l.leer(scanner);
            this.L[i] = l;
        }
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
        a += "Reserva{\n" +
                "\tci=" + ci + "\n" +
                "\tnroLibros=" + nroLibros + "\n" +
                "\tnombreLector=" + nombreLector + "\n" +
                "\tfechaPrestamo=" + fechaPrestamo + "\n" +
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

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
}
