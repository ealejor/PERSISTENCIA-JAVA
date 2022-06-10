package liberation;

public class Lector {
    private String nombre;
    private int ci;
    private Prestamo prestamo;
    private Reserva reserva;

    public Lector(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
        this.prestamo = new Prestamo(this);
        this.reserva = new Reserva(this);
    }

    public Lector() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
}
