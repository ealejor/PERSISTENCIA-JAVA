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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getnProd() {
        return nProd;
    }

    public void setnProd(int nProd) {
        this.nProd = nProd;
    }

    public Item[] getIt() {
        return it;
    }

    public void setIt(Item item) {
        for (int i = 0; i < nProd; i++) {
            if (it[i] == null){
                it[i] = item;
                break;
            }
        }
    }

    public int[] getDesc() {
        return desc;
    }

    public void setDesc(int[] desc) {
        this.desc = desc;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }
}
