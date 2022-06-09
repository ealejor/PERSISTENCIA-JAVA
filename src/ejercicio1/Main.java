package ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nInstanciar 2 obj. Factura con 2 y 3 productos respectivamente y mostrar datos.");
        Item p1 = new Item("Coca cola", 10.0);
        Item p2 = new Item("Pepsi", 12);
        Item p3 = new Item("tv", 5000);
        Item p4 = new Item("Lavadora", 9000);
        Item p5 = new Item("Sprite", 2);

        Factura factura1 = new Factura(1000, 2, 148325);
        factura1.setIt(p1);
        factura1.setIt(p2);

        Factura factura2 = new Factura(2000, 3, 852145);
        factura2.setIt(p3);
        factura2.setIt(p4);
        factura2.setIt(p5);
    }
}
