package n3ex1;

import java.util.Scanner;

/**
 * El mètode principal executa un loop infinit que simula un menú interactiu
 * fent ús d'una variable selectora i un switch:case. Els diferents tipus d'objectes i mètodes emprats
 * s'implementen a les altres classes.
 */

public class Main {

    public static void main(String[] args) {

        //Inicialitzar
        Scanner scanner = new Scanner(System.in);
        GestorRedaccio gestor = new GestorRedaccio(scanner);

        //Llegir input i programa principal

        int select; //Selector del menú principal

        //Fins que no se seleccioni el darrer estat (select = 8), segueix executant
        do {

            printMenu();

            select = scanner.nextInt();
            scanner.nextLine();

            switch (select) {
                //Introduir redactor
                case 1 -> gestor.introduirRedactor();

                //Eliminar redactor
                case 2 -> gestor.eliminarRedactor();

                //Introduir notícia a un redactor
                case 3 -> gestor.introduirNoticia();

                //Eliminar notícia (demana redactor i titular)
                case 4 -> gestor.eliminarNoticia();

                //Mostra totes les notícies d'un redactor
                case 5 -> gestor.mostraNoticies();

                //Calcular puntuació d'una notícia
                case 6 -> gestor.imprimirPuntuacio();

                //Calcular preu d'una notícia
                case 7 -> gestor.imprimirPreu();

                //Sortir del loop
                case 0 -> System.out.println("Sortint del programa");

            }

        } while (select != 0);

    }

    static void printMenu() {

        System.out.println("""
                -------------------
                Escolliu una opció:
                1: Introduir un redactor
                2: Eliminar redactor
                3: Introduïr notícia a un redactor
                4: Eliminar notícia
                5: Mostrar totes les notícies del redactor
                6: Calcular puntuació d'una notícia
                7: Calcular preu d'una notícia
                0: Sortir
                ------------------
                """);

    }

}