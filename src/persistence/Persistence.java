package persistence;

import liberation.file.MyObjectOutputStream;

import java.io.*;

public class Persistence<E> {

    private final File file;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private E value;

    public Persistence(String name) {
        this.file = new File(name);
    }

    public void crear() {
        try {
            if (file.createNewFile()) {
                System.out.println("se ha creado el archivo con éxito");
            } else {
                System.out.println("el archivo ya ha sido creado anteriormente");
            }
        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo, ruta invalida...");
        }
    }

    public void eliminar() {
        if (file.isFile()) {
            if (!file.delete()) System.out.println("error al eliminar");
        }
    }

    public void alta(E element) {
        try {
            if (file.length() > 0) {
                oos = new MyObjectOutputStream(new FileOutputStream(file, true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(file));
            }
            oos.writeObject(value);
            oos.flush();
            oos.close();
            System.out.println("guardado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
        } catch (IOException e) {
            System.out.println("error de entrada y salida");
        }
    }

    @SuppressWarnings("unchecked")
    public void baja(E element) {
        File temp = new File("tmp.txt");
        try {
            if (!temp.createNewFile()) System.out.println("error al crear el archivo aux");
        } catch (IOException e) {
            System.out.println("no se a podido crear el archivo aux");
        }
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            oos = new ObjectOutputStream(new FileOutputStream(temp));
            while (true) {
                value = (E) ois.readObject();
                if (!value.equals(element)) {
                    oos.writeObject(value);
                }
            }

        } catch (EOFException e) {
            try {
                if (ois != null) ois.close();
                if (oos != null) oos.close();
                file.delete();
                temp.renameTo(file);
            } catch (IOException exception) {
                System.out.println("error de entrar y salida");
            }
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrada");
        } catch (IOException e) {
            System.out.println("error de entrada y salida");
        }
    }

    public void cambio() throws IOException {
    }

    @SuppressWarnings("unchecked")
    public void listar() {
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                value = (E) ois.readObject();
            }
        } catch (EOFException e) {
            try {
                if (ois != null) {
                    ois.close();
                    System.out.println("fin de lectura");
                }
            } catch (IOException ioe) {
                System.out.println("error de entrada y salida");
            }
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrada");
        } catch (IOException e) {
            System.out.println("error de entrada y salida");
        }
    }
}
