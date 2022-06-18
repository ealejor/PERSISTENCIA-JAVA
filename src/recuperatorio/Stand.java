package recuperatorio;

public class Stand {
    private String temario;
    private int codParticipante;
    private int nroProductos;
    private final Producto[] productos = new Producto[30];

    public Stand(String temario, int codParticipante, int nroProductos) {
        this.temario = temario;
        this.codParticipante = codParticipante;
        this.nroProductos = nroProductos;
    }

    public void mostrar() {
        System.out.println("Temario: " + temario);
        System.out.println("Código participante: " + codParticipante);
        System.out.println("Número de productos: " + nroProductos);
        System.out.println("------------------------------------------");
        for (int i = 0; i < nroProductos; i++) {
            if (productos[i] != null) {
                System.out.println(productos[i]);
            }
        }
    }

    public String getTemario() {
        return temario;
    }

    public void setTemario(String temario) {
        this.temario = temario;
    }

    public int getCodParticipante() {
        return codParticipante;
    }

    public void setCodParticipante(int codParticipante) {
        this.codParticipante = codParticipante;
    }

    public int getNroProductos() {
        return nroProductos;
    }

    public void setNroProductos(int nroProductos) {
        this.nroProductos = nroProductos;
    }

    public Producto getProductos(int i) {
        return productos[i];
    }

    public void setProducto(Producto producto) {
        for (int i = 0; i < nroProductos; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }
    }
}
