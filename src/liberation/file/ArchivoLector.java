package liberation.file;

import liberation.Lector;

import java.io.*;

public class ArchivoLector {
    private final File file;

    public ArchivoLector(String name) {
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

    public void agregar(Lector lector) {
        ObjectOutputStream oos;
        try {
            if (file.length() > 0){
                oos = new MyObjectOutputStream(new FileOutputStream(file, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(file));
            }
            oos.writeObject(lector);
            oos.flush();
            oos.close();
            System.out.println("Guardado");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException write");
        } catch (IOException e) {
            System.out.println("IOException write");
        }
    }

    public void listar() {
        ObjectInputStream ois = null;
        try {
            Lector lector;
            ois = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                lector = (Lector) ois.readObject();
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
