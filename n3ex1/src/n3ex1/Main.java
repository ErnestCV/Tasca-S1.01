package n3ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * El mètode principal executa un loop infinit que simula un menú interactiu
 * fent ús d'una variable selectora i un switch:case. Els diferents tipus d'objectes i mètodes emprats
 * s'implementen a les altres classes.
 */

public class Main {

    public static void main(String[] args) {

        //Inicialitzar llistat redactors
        ArrayList<Redactor> redactors = new ArrayList<>();

        //Llegir input i programa principal

        Scanner scanner = new Scanner(System.in);
        int select; //Selector del menú principal

        System.out.println("Menú principal");
        Printer.printMenu();

        select = scanner.nextInt();
        scanner.nextLine();

        //Fins que no se seleccioni el darrer estat (select = 8), segueix executant
        while(true) {

            switch (select){
                //Introduir redactor
                case 1:{
                    String nom = Redactor.getRedactor(scanner);
                    String DNI = Redactor.getDNI(scanner);

                    Redactor redactor = new Redactor(nom, DNI);
                    redactors.add(redactor);

                    System.out.println("Redactor afegit\n");

                    Printer.printMenu();
                    break;
                }
                //Eliminar redactor
                case 2:{
                    String nom = Redactor.getRedactor(scanner);

                    Redactor redactor = Finder.redactorFinder(redactors, nom);
                    redactors.remove(redactor);

                    System.out.println("Redactor esborrat\n");

                    Printer.printMenu();
                    break;
                }
                //Introduir notícia a un redactor
                case 3:{
                    String nom = Redactor.getRedactor(scanner);

                    Redactor redactor = Finder.redactorFinder(redactors, nom);

                    String tipus = Noticia.getType(scanner);
                    String titular = Noticia.getTitular(scanner);
                    String text = Noticia.getText(scanner);

                    //Diferents classes i mètodes depenent del tipus
                    switch (tipus){
                        case "futbol":{

                            String competicio = NoticiaFutbol.getCompeticio(scanner);
                            String club = NoticiaFutbol.getClub(scanner);
                            String jugador = NoticiaFutbol.getJugador(scanner);

                            NoticiaFutbol noticia = new NoticiaFutbol(titular, text, competicio, club, jugador);
                            redactor.noticies.add(noticia);

                            System.out.println("Notícia afegida\n");
                            break;
                        }
                        case "basquet":{

                            String competicio = NoticiaBasquet.getCompeticio(scanner);
                            String club = NoticiaBasquet.getClub(scanner);

                            NoticiaBasquet noticia = new NoticiaBasquet(titular, text, competicio, club);
                            redactor.noticies.add(noticia);

                            System.out.println("Notícia afegida\n");
                            break;
                        }
                        case "tenis":{

                            String competicio = NoticiaTenis.getCompeticio(scanner);
                            String[] tenistes = NoticiaTenis.getTenistes(scanner);

                            NoticiaTenis noticia = new NoticiaTenis(titular, text, competicio, tenistes);
                            redactor.noticies.add(noticia);

                            System.out.println("Notícia afegida\n");
                            break;
                        }
                        case "f1":{

                            String escuderia = NoticiaF1.getEscuderia(scanner);

                            NoticiaF1 noticia = new NoticiaF1(titular, text, escuderia);
                            redactor.noticies.add(noticia);

                            System.out.println("Notícia afegida\n");
                            break;
                        }
                        case "motociclisme":{

                            String equip = NoticiaMotociclisme.getEquip(scanner);

                            NoticiaMotociclisme noticia = new NoticiaMotociclisme(titular, text, equip);
                            redactor.noticies.add(noticia);

                            System.out.println("Notícia afegida\n");
                            break;
                        }
                    }

                    Printer.printMenu();
                    break;
                }
                //Eliminar notícia (demana redactor i titular)
                case 4:{
                    String nom = Redactor.getRedactor(scanner);
                    Redactor redactor = Finder.redactorFinder(redactors, nom);

                    String titular = Noticia.getTitular(scanner);

                    Eliminar.eliminar(redactor.noticies, titular);

                    System.out.println("La notícia ha estat eliminada");

                    Printer.printMenu();
                    break;
                }
                //Mostra totes les notícies d'un redactor
                case 5:{
                    String nom = Redactor.getRedactor(scanner);
                    Redactor redactor = Finder.redactorFinder(redactors, nom);
                    int counter = 1;

                    if (redactor.noticies.size() == 1) {
                        System.out.println("Aquest redactor té " + redactor.noticies.size() + " notícia:");
                    } else {
                        System.out.println("Aquest redactor té " + redactor.noticies.size() + " notícies:");
                    }
                    for (Object noticia : redactor.noticies){
                        System.out.print("Notícia " + counter + " - ");
                        counter++;
                        System.out.println(noticia);
                    }

                    Printer.printMenu();
                    break;
                }
                //Calcular puntuació d'una notícia
                case 6:{
                    String nom = Redactor.getRedactor(scanner);
                    Redactor redactor = Finder.redactorFinder(redactors, nom);

                    String titular = Noticia.getTitular(scanner);

                    int puntuacio = Puntuacio.calcularPuntuacio(redactor.noticies, titular);
                    System.out.println("La puntuació de la notícia és: " + puntuacio + " punts");

                    Printer.printMenu();
                    break;
                }
                //Calcular preu d'una notícia
                case 7:{
                    String nom = Redactor.getRedactor(scanner);
                    Redactor redactor = Finder.redactorFinder(redactors, nom);

                    String titular = Noticia.getTitular(scanner);

                    int preu = Preu.calcularPreu(redactor.noticies, titular);
                    System.out.println("El preu de la notícia és: " + preu + "€");

                    Printer.printMenu();
                    break;
                }
                //Sortir del loop
                case 8:{
                    System.out.println("Sortint del programa");
                    break;
                }
            }

            if (select == 8) break;

            //Llegir el següent selector
            select = scanner.nextInt();
            scanner.nextLine(); //S'ha d'afegir perquè nextInt() no té en compte el salt de línia


        }


    }

}