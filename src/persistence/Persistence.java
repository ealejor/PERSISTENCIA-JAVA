package persistence;

import java.io.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Persistence<E> {
    //private final File file;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private E value;

    private Archive file;

    private boolean log;

    public Persistence(Archive file) {
        this.file = file;
    }

    public void enableLogger(boolean log) {
        this.log = log;
    }

    public boolean create(E element) {
        try {
            if (file.get().length() > 0) {
                oos = new CustomObjectOutputStream(new FileOutputStream(file.get(), true));
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(file.get()));
            }
            oos.writeObject(element);
            oos.flush();
            oos.close();
            if (log) System.out.println("guardado correctamente");
            return true;
        } catch (FileNotFoundException e) {
            if (log) System.out.println("archivo no encontrado");
        } catch (IOException e) {
            if (log) System.out.println("error de entrada y salida");
        }
        return false;
    }

    public void delete(Function<E, Boolean> function) {
        File temp = new File("tmp.txt");
        try {
            if (!temp.createNewFile()) if (log) System.out.println("error al crear el archivo aux");
        } catch (IOException e) {
            if (log) System.out.println("no se a podido crear el archivo aux");
        }
        try {
            ois = new ObjectInputStream(new FileInputStream(file.get()));
            oos = new ObjectOutputStream(new FileOutputStream(temp));
            while (true) {
                value = (E) ois.readObject();
                if (!function.apply(value)) {
                    oos.writeObject(value);
                }
            }

        } catch (EOFException e) {
            try {
                if (ois != null) ois.close();
                if (oos != null) oos.close();
                if (file.get().delete()) ;
                if (temp.renameTo(file.get())) ;
            } catch (IOException exception) {
                if (log) System.out.println("error de entrar y salida");
            }
        } catch (FileNotFoundException e) {
            if (log) System.out.println("archivo no encontrado");
        } catch (ClassNotFoundException e) {
            if (log) System.out.println("clase no encontrada");
        } catch (IOException e) {
            if (log) System.out.println("error de entrada y salida");
        }
    }

    @SuppressWarnings("unchecked")
    public void update(Function<E, E> function) {
        File temp = new File("tmp.txt");
        try {
            if (!temp.createNewFile()) if (log) System.out.println("error al crear el archivo aux");
        } catch (IOException e) {
            if (log) System.out.println("no se a podido crear el archivo aux");
        }
        try {
            ois = new ObjectInputStream(new FileInputStream(file.get()));
            oos = new ObjectOutputStream(new FileOutputStream(temp));
            while (true) {
                value = (E) ois.readObject();
                E tmp = function.apply(value);
                if (tmp != null) {
                    oos.writeObject(tmp);
                } else {
                    oos.writeObject(value);
                }
            }

        } catch (EOFException e) {
            try {
                if (ois != null) ois.close();
                if (oos != null) oos.close();
                if (file.get().delete()) ;
                if (temp.renameTo(file.get())) ;
            } catch (IOException exception) {
                if (log) System.out.println("error de entrar y salida");
            }
        } catch (FileNotFoundException e) {
            if (log) System.out.println("archivo no encontrado");
        } catch (ClassNotFoundException e) {
            if (log) System.out.println("clase no encontrada");
        } catch (IOException e) {
            if (log) System.out.println("error de entrada y salida");
        }
    }

    /**
     * Lista todos los elementos del archivo.
     *
     * @param callback función donde se recibe el objeto.
     */
    public void list(Consumer<E> callback) {
        try {
            ois = new ObjectInputStream(new FileInputStream(file.get()));
            while (true) {
                value = (E) ois.readObject();
                callback.accept(value);
            }
        } catch (EOFException e) {
            try {
                if (ois != null) {
                    ois.close();
                    if (log) System.out.println("fin de lectura");
                }
            } catch (IOException ioe) {
                if (log) System.out.println("error de entrada y salida");
            }
        } catch (FileNotFoundException e) {
            if (log) System.out.println("archivo no encontrado");
        } catch (ClassNotFoundException e) {
            if (log) System.out.println("clase no encontrada");
        } catch (IOException e) {
            if (log) System.out.println("error de entrada y salida");
        }
    }


    public static void main(String[] args) {
        Archive in = new Archive("val.txt");
        in.close();
        in.open();
        Persistence<Integer> integers = new Persistence<>(in);

        integers.create(45);
        integers.create(46);
        integers.create(78);
        integers.create(28);
        integers.list(integer -> System.out.println("value: " + integer));

        integers.delete(integer -> integer == 46);

        integers.update(integer -> {
            if (integer == 45) {
                integer = 4555;
                return integer;
            } else {
                return null;
            }
        });
        System.out.println("----");
        integers.list(integer -> System.out.println("value: " + integer));
    }
}
