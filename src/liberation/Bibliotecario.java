package liberation;

import java.io.Serializable;

public class Bibliotecario implements Serializable {
    private String nombre;

    public Bibliotecario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
