package persistence;

import java.io.File;
import java.io.IOException;

public class Archive {
    private final File file;
    private boolean log;

    public Archive(String name) {
        this.file = new File(name);
    }

    public void open() {
        try {
            if (file.createNewFile()) {
                if (log) System.out.println("se ha creado el archivo con éxito");
            } else {
                if (log) System.out.println("el archivo ya ha sido creado anteriormente");
            }
        } catch (IOException e) {
            if (log) System.out.println("no se ha podido crear el archivo, ruta invalida...");
        }
    }

    public void close() {
        if (file.isFile()) {
            if (!file.delete()) if (log) System.out.println("error al eliminar");
        }
    }

    public File get() {
        return file;
    }
}

