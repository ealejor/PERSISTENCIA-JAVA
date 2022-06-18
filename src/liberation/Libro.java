package liberation;

import java.io.Serializable;
import java.util.Scanner;

public class Libro implements Serializable {
    private String nombre;
    private String autor;
    private int nroPag;
    private String codigo;
    private String estado;

    public Libro(String nombre, String autor, int nroPag, String codigo, String estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.nroPag = nroPag;
        this.codigo = codigo;
        this.estado = estado;
    }
    public Libro(){}

    public void leer(Scanner scanner){
        System.out.print("Ingrese el título del libro: ");
        this.nombre = scanner.next();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.next();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.nroPag = scanner.nextInt();
        System.out.print("Ingrese el código del libro: ");
        this.codigo = scanner.next();
        System.out.print("Ingrese el estado del libro: ");
        this.estado = scanner.next();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", nroPag=" + nroPag +
                ", codigo='" + codigo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
