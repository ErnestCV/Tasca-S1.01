package n3ex1.noticia;

import java.util.Scanner;

public class NoticiaBasquet extends Noticia {

    private final String competicio;
    private final String club;

    public NoticiaBasquet(String titular, String text, String competicio, String club){
        super(titular, text);
        this.competicio = competicio;
        this.club = club;

    }

    @Override
    public int calcularPreuNoticia(){

        int preu = 250;
        if (competicio.equals("Eurolliga"))
            preu += 75;
        if (club.equals("Barça") || club.equals("Madrid"))
            preu += 75;

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia(){

        int puntuacio = 4;
        if (competicio.equals("Eurolliga")) {
            puntuacio += 3;
        } else if (competicio.equals("ACB")) {
            puntuacio += 2;
        }
        if (club.equals("Barça") || club.equals("Madrid"))
            puntuacio += 1;

        return puntuacio;
    }

    public static NoticiaBasquet crearNoticiaBasquet(Scanner scanner, String titular, String text) {

        System.out.println("Introduïu a quina competició s'està jugant: ");
        String competicio = scanner.nextLine();
        System.out.println("Introduïu el club: ");
        String club = scanner.nextLine();

        return new NoticiaBasquet(titular, text, competicio, club);

    }

}
