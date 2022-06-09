package ejercicio1;

public class Factura extends Recibo {
    private int nit;

    public Factura(int num, int nProd, int nit) {
        super(num, nProd);
        this.nit = nit;
    }

    public Factura() {
        super();
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
