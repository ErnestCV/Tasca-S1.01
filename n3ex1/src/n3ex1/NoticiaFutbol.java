package n3ex1;

import java.util.Scanner;

public class NoticiaFutbol extends Noticia {

    String competicio;
    String club;
    String jugador;
    static final String tipus = "futbol";

    public NoticiaFutbol(String titular, String text, String competicio, String club, String jugador){
        super(titular, text);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;

    }

    public static String getCompeticio(Scanner scanner){
        System.out.println("Introduïu a quina competició s'està jugant: ");
        return scanner.nextLine();
    }

    public static String getClub(Scanner scanner){
        System.out.println("Introduïu el club: ");
        return scanner.nextLine();
    }

    public static String getJugador(Scanner scanner){
        System.out.println("Introduïu el jugador: ");
        return scanner.nextLine();
    }


    public int calcularPreuNoticia(String competicio, String club, String jugador){

        int preu = 300;
        if (competicio.equals("Lliga de Campions"))
            preu += 100;
        if (club.equals("Barça") || club.equals("Madrid"))
            preu += 100;
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema"))
            preu += 50;

        return preu;
    }

    public int calcularPuntuacioNoticia(String competicio, String club, String jugador){

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

    @Override
    public String toString(){
        return "Titular: " + titular;
    }

}
