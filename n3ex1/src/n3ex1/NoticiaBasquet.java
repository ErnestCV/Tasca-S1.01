package n3ex1;

import java.util.Scanner;

public class NoticiaBasquet extends Noticia {

    String competicio;
    String club;
    static final String tipus = "basquet";

    public NoticiaBasquet(String titular, String text, String competicio, String club){
        super(titular, text);
        this.competicio = competicio;
        this.club = club;

    }

    public static String getCompeticio(Scanner scanner){
        System.out.println("Introduïu a quina competició s'està jugant: ");
        return scanner.nextLine();
    }

    public static String getClub(Scanner scanner){
        System.out.println("Introduïu el club: ");
        return scanner.nextLine();
    }


    public int calcularPreuNoticia(String competicio, String club){

        int preu = 250;
        if (competicio.equals("Eurolliga"))
            preu += 75;
        if (club.equals("Barça") || club.equals("Madrid"))
            preu += 75;

        return preu;
    }

    public int calcularPuntuacioNoticia(String competicio, String club){

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

    @Override
    public String toString(){
        return "Titular: " + titular;
    }

}
