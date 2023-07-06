package main;

import java.util.Scanner;

public class Main {
    static String BLACK = "\u001B[30;1;3m";
    static String RED = "\u001B[31;1;3m";
    static String GREEN = "\u001B[32;1;3m";
    static String YELLOW = "\u001B[33;1;3m";
    static String BLUE = "\u001B[34;1;3m";
    static String MAGENTA = "\u001B[35;1;3m";
    static String CYAN = "\u001B[36;1;3m";
    static String WHITE = "\u001B[37;1;3m";
    static String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("=== === === === === MENÚ === === === === ===\n");
            System.out.println(WHITE + "\t1) " + RESET + MAGENTA + "AGREGAR" + RESET);
            System.out.println(WHITE + "\t2) " + RESET + MAGENTA + "ELIMINAR" + RESET);
            System.out.println(WHITE + "\t3) " + RESET + MAGENTA + "EDITAR" + RESET);
            System.out.println(WHITE + "\t4) " + RESET + MAGENTA + "LISTAR" + RESET);
            System.out.println(WHITE + "\t5) " + RESET + MAGENTA + "SALIR" + RESET);
            System.out.print(CYAN + "\nSeleccione una opción" + RESET + GREEN + " >>> " + RESET);

            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                option = 0;
            } else {
                try {
                    option = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    option = 0;
                }
            }


            switch (option) {
                case 1:
                    // Lógica para la opción 1
                    break;
                case 2:
                    // Lógica para la opción 2
                    break;
                case 3:
                    // Lógica para la opción 3
                    break;
                case 4:
                    // Lógica para la opción 4
                    break;
                case 5:
                    System.out.println(YELLOW + "\nSaliendo del programa..." + RESET);
                    break;
                default:
                    System.out.println(RED + "\nOpción inválida!!!\n" + RESET);
                    break;
            }
        } while (option != 5);
        scanner.close();
    }
}