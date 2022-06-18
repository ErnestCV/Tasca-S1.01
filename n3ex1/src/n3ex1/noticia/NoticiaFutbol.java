package n3ex1.noticia;

import java.util.Scanner;

public class NoticiaFutbol extends Noticia {

    private final String competicio;
    private final String club;
    private final String jugador;
    static final String tipus = "futbol";

    public NoticiaFutbol(String titular, String text, String competicio, String club, String jugador){
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;

    }

    @Override
    public int calcularPreuNoticia(){

        int preu = 300;
        if (competicio.equals("Lliga de Campions"))
            preu += 100;
        if (club.equals("Barça") || club.equals("Madrid"))
            preu += 100;
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema"))
            preu += 50;

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia(){

        int puntuacio = 5;
        if (competicio.equals("Lliga de Campions")) {
            puntuacio += 3;
        } else if (competicio.equals("Lliga")) {
            puntuacio += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid"))
            puntuacio += 1;
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema"))
            puntuacio += 1;

        return puntuacio;
    }
    public static NoticiaFutbol crearNoticiaFutbol(Scanner scanner, String titular, String text) {

        System.out.println("Introduïu a quina competició s'està jugant: ");
        String competicio = scanner.nextLine();
        System.out.println("Introduïu el club: ");
        String club = scanner.nextLine();
        System.out.println("Introduïu el jugador: ");
        String jugador = scanner.nextLine();

        return new NoticiaFutbol(titular, text, competicio, club, jugador);

    }

}
