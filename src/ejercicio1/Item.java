package ejercicio1;

public class Item {
    private String nom;
    private double precio;

    public Item(String nom, double precio) {
        this.nom = nom;
        this.precio = precio;
    }

    public Item(){}

    @Override
    public String toString() {
        return "Item{" +
                "nom='" + nom + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
