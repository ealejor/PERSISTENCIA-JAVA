package ejercicio1;

import java.io.Serializable;

public class Recibo implements Serializable {
    protected int num;
    protected int nProd;
    protected Item[] it = new Item[50];
    protected int[] desc = new int[50];
    protected Cliente c;

    public Recibo() {
    }

    public Recibo(int num, int nProd, Item[] it, int[] desc, Cliente c) {
        this.num = num;
        this.nProd = nProd;
        this.it = it;
        this.desc = desc;
        this.c = c;
    }

    public Recibo(int num, int nProd) {
        this.num = num;
        this.nProd = nProd;
        this.c = new Cliente();
        this.desc[0] = 10; // descuento para p1
        this.desc[1] = 5; // descuento para p2
        this.desc[2] = 20; // descuento para p3
        this.desc[3] = 2; // descuento para p4
        this.desc[4] = 25; // descuento para p5
    }

    public void mostrar() {
        System.out.println("Número de factura: " + num);
        System.out.print("Cliente: " + c.toString());
        System.out.println("Número de productos: " + nProd);
        for (int i = 0; i < nProd; i++) {
            if (it[i] != null){
                System.out.println((i + 1) + ": " + it[i].toString());
            }
        }
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
            if (it[i] == null) {
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
