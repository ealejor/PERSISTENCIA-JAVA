package recuperatorio;

public class Participante {
    private int codigo;
    private String nombre;

    public Participante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Participante() {
    }

    @Override
    public String toString() {
        return "Participante{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
