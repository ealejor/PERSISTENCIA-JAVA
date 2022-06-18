package liberation;

import liberation.file.ArchivoBiblioteca;
import liberation.file.ArchivoLector;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArchivoLector archivoLector = new ArchivoLector("lector.txt");
    static ArchivoBiblioteca archivoBiblioteca = new ArchivoBiblioteca("biblioteca.txt");

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n1: Crear, Adicionar y Listar al menos 6 Lectores enArchLector y al menos 3 Bibliotecas enArchBiblioteca");
            System.out.println("2: Mostrar el nombre de la biblioteca donde se hicieron masPrestamos");
            System.out.println("3: Mostrar el nombre del Lector que hizo mas reservas");
            System.out.println("4: Eliminar la biblioteca donde el Lector o Lectores con nombre X hicieron una reserva");
            System.out.println("5: Ordenar las bibliotecas en orden alfabético");
            System.out.println("6: Salir\n");

            System.out.print(">>> ");
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("\nError de entrada ¡Adiós!");
                break;
            }
            switch (option) {
                case 1:
                    Biblioteca biblioteca1 = new Biblioteca("Eduardo", 4, 2);
                    Biblioteca biblioteca2 = new Biblioteca("María", 0, 0);
                    Biblioteca biblioteca3 = new Biblioteca("José", 0, 0);

                    // LECTOR 1
                    Lector lector1 = new Lector("María", 125);
                    Reserva reserva1 = new Reserva(lector1, "12/04/22", 2);
                    reserva1.setL(new Libro("a", "x", 1000, "7854", "nuevo"));
                    reserva1.setL(new Libro("b", "y", 1000, "7854", "nuevo"));
                    lector1.setReserva(reserva1);
                    biblioteca1.setReservas(reserva1);

                    // LECTOR 2
                    Lector lector2 = new Lector("Raúl", 178);
                    Reserva reserva2 = new Reserva(lector1, "12/04/22", 1);
                    reserva2.setL(new Libro("a", "x", 1000, "7854", "nuevo"));
                    lector2.setReserva(reserva2);
                    biblioteca1.setReservas(reserva2);

                    // LECTOR 3
                    Lector lector3 = new Lector("Ademar", 125);
                    Reserva reserva3 = new Reserva(lector1, "12/04/22", 3);
                    reserva3.setL(new Libro("a", "x", 1000, "3214", "nuevo"));
                    reserva3.setL(new Libro("b", "y", 7855, "965", "nuevo"));
                    reserva3.setL(new Libro("C", "z", 500, "7525", "nuevo"));
                    lector3.setReserva(reserva3);
                    biblioteca1.setReservas(reserva3);

                    // LECTOR 4
                    Lector lector4 = new Lector("María", 125);
                    Reserva reserva4 = new Reserva(lector1, "12/04/22", 2);
                    reserva4.setL(new Libro("a", "x", 1000, "7854", "nuevo"));
                    reserva4.setL(new Libro("b", "y", 1000, "7854", "nuevo"));
                    lector4.setReserva(reserva4);
                    biblioteca1.setReservas(reserva4);

                    // LECTOR 5
                    Lector lector5 = new Lector("Raúl", 178);
                    Prestamo reserva5 = new Prestamo(lector1, "12/04/22", "21/06/22", 1);
                    reserva5.setL(new Libro("a", "x", 1000, "7854", "nuevo"));
                    lector5.setPrestamo(reserva5);
                    biblioteca1.setPrestamos(reserva5);

                    // LECTOR 6
                    Lector lector6 = new Lector("Raúl", 178);
                    Prestamo reserva6 = new Prestamo(lector1, "12/04/22", "21/06/22", 1);
                    reserva6.setL(new Libro("a", "x", 1000, "7854", "nuevo"));
                    lector6.setPrestamo(reserva6);
                    biblioteca1.setPrestamos(reserva6);

                    archivoLector.alta(lector1);
                    archivoLector.alta(lector2);
                    archivoLector.alta(lector3);
                    archivoLector.alta(lector4);
                    archivoLector.alta(lector5);
                    archivoLector.alta(lector6);

                    archivoBiblioteca.alta(biblioteca1);
                    archivoBiblioteca.alta(biblioteca2);
                    archivoBiblioteca.alta(biblioteca3);

                    archivoLector.listar();
                    archivoBiblioteca.listar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 7:
                    System.out.println("\nvuelva pronto... gracias");
                    break;
                default:
                    System.out.println("\nopción no válida!!!");
                    break;
            }
        } while (option != 6);
    }
}
