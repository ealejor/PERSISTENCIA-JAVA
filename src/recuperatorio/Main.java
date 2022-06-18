package recuperatorio;

public class Main {
    public static void main(String[] args) {
        System.out.println("\na)");
        Stand stand1 = new Stand("temario1", 4, 2);
        stand1.setProducto(new Producto("producto 1", 45));
        stand1.setProducto(new Producto("producto 2", 9));

        Stand stand2 = new Stand("temario2", 6, 3);
        stand2.setProducto(new Producto("PRODUCTO 1", 8));
        stand2.setProducto(new Producto("PRODUCTO 2", 9));
        stand2.setProducto(new Producto("PRODUCTO 3", 54));
        stand2.setProducto(new Producto("PRODUCTO 4", 3));

        Feria feria = new Feria("FERIA", "14-12-2022", "12-5-2022", 2, 2);
        feria.setStand(stand1);
        feria.setStand(stand2);
        feria.setParticipante(new Participante(4, "Mario"));
        feria.setParticipante(new Participante(6, "Ángela"));

        feria.mostrar();

        System.out.println("\nb)");

        System.out.println("\nc)");
        feria.mayorInv();
    }
}
