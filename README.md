## Persistencia de datos en java
La persistencia de datos en Java se refiere a la capacidad
de almacenar y recuperar información de forma permanente en una
aplicación. Permite que los datos se mantengan más allá de la 
ejecución del programa, lo que implica que se guarden en algún 
tipo de almacenamiento persistente, como una base de datos, 
archivos en disco o incluso servicios en la nube.

```mermaid
classDiagram
    class ArchivoLector {
        nombre: string
        regLector: Lector
    }
    class Lector {
        -nombre: string
        -ciLector: int
    }
    class Préstamo {
        -L: Libro[]
        -ci: int
        -nombreLector: string
        -fechaPréstamo: string
        -fechaDevolución: string
    }
    class Bibliotecario {
        -nombre: string
    }
    class Libro {
        -nombre: string
        -autor: string
        -nroPag: int
        -código: string
        -estado: string
    }
    class Reserva {
        L: Libro[]
        ci: int
        nroLibros: int
        nombreLector: string
        fecharPréstamo: string
    }
    class Biblioteca {
        nobre: string
        B: Bibliotecario
        nroPréstamo: int
        nroReserva: int
        P: Préstamo[]
        R: Reserva[]
    }
    class ArchivoBiblioteca {
        nombre: string
        regBib: Biblioteca
    }

    Lector *-- ArchivoLector
    Lector -- Préstamo
    Libro --* Préstamo
    Préstamo --* Biblioteca
    Bibliotecario --* Biblioteca
    Libro --* Reserva
    Reserva --* Biblioteca
    Biblioteca --* ArchivoBiblioteca
    Lector -- Reserva
```