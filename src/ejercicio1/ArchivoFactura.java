package ejercicio1;

import java.io.*;

public class ArchivoFactura {
    private final File file;

    public ArchivoFactura(String name) {
        this.file = new File(name);
        if (file.isFile()) {
            System.out.println("El archivo ya ha sido creado anteriormente...");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Se ha creado el archivo con exit");
                } else {
                    System.out.println("Ocurrió un error al crear el archivo");
                }
            } catch (IOException e) {
                System.out.println("No se ha podido crear el archivo, ruta invalida...");
            }
        }
    }

    public void agregar(Factura factura) {
        ObjectOutputStream oos = null;
        try {
            if (file.length() > 0){
                oos = new MyObjectOutputStream(new FileOutputStream(file, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(file));
            }
            // oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(factura);
            oos.flush();
            oos.close();
            System.out.println("Guardado");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException write");
        } catch (IOException e) {
            System.out.println("IOException write");
        }
    }

    public void listar(int X) {
        ObjectInputStream ois = null;
        try {
            Factura fac;
            ois = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                fac = (Factura) ois.readObject();
                //fac.mostrar();
                //System.out.println(fac.getNit());
                if (fac.getNit() == X){
                    System.out.println("El nit " + X + " pertenece al cliente " + fac.getC());
                } else {
                    //System.out.println("No existe el cliente con nit " + X);
                }
            }
        } catch (EOFException e) {
            try {
                if (ois != null) ois.close();
                System.out.println("Fin de lectura");
            } catch (IOException ioe) {
                System.out.println("IOException read 1");
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException read");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException read");
        } catch (IOException e) {
            System.out.println("IOException read 2");
        }
    }
}
