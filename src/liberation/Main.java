package liberation;

import liberation.file.ArchivoBiblioteca;
import liberation.file.ArchivoLector;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Eduardo", 2, 1);
        Biblioteca biblioteca2 = new Biblioteca("María", 1, 2);
        Biblioteca biblioteca3 = new Biblioteca("José", 1, 1);

        ArchivoBiblioteca archivoBiblioteca = new ArchivoBiblioteca("biblioteca.txt");
        archivoBiblioteca.agregar(biblioteca1);
        archivoBiblioteca.agregar(biblioteca2);
        archivoBiblioteca.agregar(biblioteca3);

        Lector lector1 = new Lector("Samuel", 125);
        Lector lector2 = new Lector("Cinthia", 358);
        Lector lector3 = new Lector("Kevin", 785);
        Lector lector4 = new Lector("Ademar", 127);
        Lector lector5 = new Lector("Celia", 951);
        Lector lector6 = new Lector("Felipe", 357);
        ArchivoLector archivoLector = new ArchivoLector("lector.txt");
        archivoLector.agregar(lector1);
        archivoLector.agregar(lector2);
        archivoLector.agregar(lector3);
        archivoLector.agregar(lector4);
        archivoLector.agregar(lector5);
        archivoLector.agregar(lector6);

    }
}
