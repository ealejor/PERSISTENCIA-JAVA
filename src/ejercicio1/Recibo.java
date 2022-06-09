package ejercicio1;

public class Recibo {
    protected int num;
    protected int nProd;
    protected Item[] it = new Item[50];
    protected int[] desc = new int[50];
    protected Cliente c;

    public Recibo(){}

    public Recibo(int num, int nProd, Item[] it, int[] desc, Cliente c) {
        this.num = num;
        this.nProd = nProd;
        this.it = it;
        this.desc = desc;
        this.c = c;
    }

    public Recibo(int num, int nProd){
        this.num = num;
        this.nProd = nProd;
        this.c = new Cliente();
    }
}
