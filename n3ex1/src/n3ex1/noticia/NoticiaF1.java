package n3ex1.noticia;

import java.util.Scanner;

public class NoticiaF1 extends Noticia {

    private final String escuderia;

    NoticiaF1(String titular, String text, String escuderia){
        super(titular, text);
        this.escuderia = escuderia;

    }

    @Override
    public int calcularPreuNoticia(){

        int preu = 100;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes"))
            preu += 50;

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia(){

        int puntuacio = 4;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes"))
            puntuacio += 2;

        return puntuacio;
    }

    public static NoticiaF1 crearNoticiaF1(Scanner scanner, String titular, String text) {

        System.out.println("Introduïu a quina escuderia pertany el vehicle: ");
        String escuderia = scanner.nextLine();

        return new NoticiaF1(titular, text, escuderia);

    }

    @Override
    public String toString(){
        return "Titular: " + titular;
    }
}
