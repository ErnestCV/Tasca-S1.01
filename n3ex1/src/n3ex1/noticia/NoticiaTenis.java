package n3ex1.noticia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoticiaTenis extends Noticia {

    private final String competicio;
    private final List<String> tenistes;

    NoticiaTenis(String titular, String text, String competicio, List<String> tenistes){
        super(titular, text);
        this.competicio = competicio;
        this.tenistes = tenistes;

    }

    public static String getCompeticio(Scanner scanner){
        System.out.println("Introduïu a quina competició s'està jugant: ");
        return scanner.nextLine();
    }

    private static List<String> getTenistes(Scanner scanner){
        System.out.println("Introduïu els tenistes o escriviu stop per deixar d'afegir-ne: ");
        ArrayList<String> llistaTenistes = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"stop".equals(input)) {
            llistaTenistes.add(input);
            input = scanner.nextLine();
        }

        return llistaTenistes;
    }

    public static NoticiaTenis crearNoticiaTenis(Scanner scanner, String titular, String text) {

        System.out.println("Introduïu a quina competició s'està jugant: ");
        String competicio = scanner.nextLine();
        List<String> tenistes = getTenistes(scanner);

        return new NoticiaTenis(titular, text, competicio, tenistes);

    }

    @Override
    public int calcularPreuNoticia(){

        int preu = 150;
        for (String tenista : tenistes) {
            if (tenista.equals("Federer") || tenista.equals("Nadal") || tenista.equals("Djokovic"))
                preu += 100;
        }

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia(){

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
