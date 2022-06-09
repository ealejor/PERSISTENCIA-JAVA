package ejercicio1;

public class Factura {
    private int nit;

    public Factura(int nit) {
        this.nit = nit;
    }

    public Factura() {
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nit=" + nit +
                '}';
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
