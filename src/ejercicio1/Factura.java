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

    public void mostrar(){
        System.out.println("--------------------------------------");
        System.out.println("NIT: " + nit);
        super.mostrar();
    }

    // método sobrecargado para el a).
    public void mostrar(Factura factura){
        double f1 = 0;
        for (int i = 0; i < nProd; i++) {
            if (it[i] != null){
                f1 = f1 + it[i].getPrecio();
            }
        }
        double f2 = 0;
        for (int i = 0; i < factura.nProd; i++) {
            if (it[i] != null){
                f2 = f2 + factura.it[i].getPrecio();
            }
        }
        if (f1 > f2){
            System.out.println("Resp: " + c.toString() + " con un total de " + f1);
        } else if (f2 > f1){
            System.out.println("Resp: " + factura.getC().toString() + " con un total de " + f1);
        } else {
            System.out.println("Resp: Los dos clientes tienen el mismo precio para pagar.");
        }
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
