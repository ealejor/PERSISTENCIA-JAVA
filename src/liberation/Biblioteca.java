package liberation;

import java.io.Serializable;

public class Biblioteca implements Serializable {
    private String nombre;
    private Bibliotecario bibliotecario;
    private int nroReservas;
    private int nroPrestamos;
    private Prestamo[] prestamos;
    private Reserva[] reservas;

    Biblioteca(String bibliotecario, int nroReservas, int nroPrestamos){
        this.bibliotecario = new Bibliotecario(bibliotecario);
        this.nroReservas = nroReservas;
        this.nroPrestamos = nroPrestamos;
        this.prestamos = new Prestamo[this.nroPrestamos];
        this.reservas = new Reserva[this.nroReservas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public int getNroReservas() {
        return nroReservas;
    }

    public void setNroReservas(int nroReservas) {
        this.nroReservas = nroReservas;
    }

    public int getNroPrestamos() {
        return nroPrestamos;
    }

    public void setNroPrestamos(int nroPrestamos) {
        this.nroPrestamos = nroPrestamos;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }
}
