package ejercicio1;

public class Cliente {
    private String nom;
    private int ci;

    public Cliente(String nom, int ci) {
        this.nom = nom;
        this.ci = ci;
    }

    public Cliente(){}

    @Override
    public String toString() {
        return "Cliente{" +
                "nom='" + nom + '\'' +
                ", ci=" + ci +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
