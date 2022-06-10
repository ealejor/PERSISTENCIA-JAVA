package liberation;

import liberation.file.ArchivoBiblioteca;
import liberation.file.ArchivoLector;

public class Main {
    public static void main(String[] args) {
        ArchivoBiblioteca archivoBiblioteca = new ArchivoBiblioteca("biblioteca.txt");
        ArchivoLector archivoLector = new ArchivoLector("lector.txt");

    }
}
