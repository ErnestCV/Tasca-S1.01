package n3ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticiaTenis extends Noticia {

    String competicio;
    String[] tenistes;
    static final String tipus = "tenis";

    NoticiaTenis(String titular, String text, String competicio, String[] tenistes){
        super(titular, text);
        this.competicio = competicio;
        this.tenistes = tenistes;

    }

    public static String getCompeticio(Scanner scanner){
        System.out.println("Introduïu a quina competició s'està jugant: ");
        return scanner.nextLine();
    }

    public static String[] getTenistes(Scanner scanner){
        System.out.println("Introduïu els tenistes o escriviu stop per deixar d'afegir-ne: ");
        ArrayList<String> llistaTenistes = new ArrayList<>();

        String aturar = "stop";
        String temp = scanner.nextLine();
        while (!temp.equals(aturar)) {
            llistaTenistes.add(temp);
            temp = scanner.nextLine();
        }

        String[] tenistes = llistaTenistes.toArray(new String[0]);
        return tenistes;
    }

    public int calcularPreuNoticia(String[] tenistes){

        int preu = 150;
        for (String tenista : tenistes) {
            if (tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic"))
                preu += 100;
        }

        return preu;
    }

    public int calcularPuntuacioNoticia(String[] tenistes){

        int puntuacio = 4;
        for (String tenista : tenistes) {
            if (tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic"))
                puntuacio += 3;
        }

        return puntuacio;
    }

    @Override
    public String toString(){
        return "Titular: " + titular;
    }

}
