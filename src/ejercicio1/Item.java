package ejercicio1;

public class Item {
    private String nom;
    private int precio;

    public Item(String nom, int precio) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
