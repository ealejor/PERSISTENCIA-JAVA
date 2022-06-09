package ejercicio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nInstanciar 2 obj. Factura con 2 y 3 productos respectivamente y mostrar datos.");
        Item p1 = new Item("Coca cola", 10.0);
        Item p2 = new Item("Pepsi", 12);
        Item p3 = new Item("tv", 5000);
        Item p4 = new Item("Lavadora", 9000);
        Item p5 = new Item("Sprite", 2);

        Factura factura1 = new Factura();
    }
}
