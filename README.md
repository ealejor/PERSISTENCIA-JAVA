## Persistencia de datos en java
La persistencia de datos en Java se refiere a la capacidad de almacenar y recuperar información de forma permanente en una aplicación. Permite que los datos se mantengan más allá de la ejecución del programa, lo que implica que se guarden en algún tipo de almacenamiento persistente, como una base de datos, archivos en disco o incluso servicios en la nube.

```mermaid
classDiagram
    class Animal <<abstract>> {
        -edad:int
        -nombre:string
        +caminar():int
        +comer(cantidad:int):void
    }
    
    class Pato{
        -color: int
        +nadar():void
    }
    
    class Gallina{
        -clase:string
        +met():void
    }
    
    class A{
        -a:int
        +b():string
    }

    class C{
        -a:int
        +b():string
    }
    class D{
        -a:int
        +b():string
    }
    
    interface Swimmer{
        +swim(): void
    }

    Animal <|-- Pato
    Animal <|-- Gallina
    Gallina ..> A
    Gallina ..* B
    Pato --> C
    Pato --o D
```