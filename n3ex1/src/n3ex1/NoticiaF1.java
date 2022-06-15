package n3ex1;

import java.util.Scanner;

public class NoticiaF1 extends Noticia {

    String escuderia;
    static final String tipus = "f1";

    NoticiaF1(String titular, String text, String escuderia){
        super(titular, text);
        this.escuderia = escuderia;

    }

    public static String getEscuderia(Scanner scanner){
        System.out.println("Introduïu a quina escuderia pertany el vehicle: ");
        return scanner.nextLine();
    }

    public int calcularPreuNoticia(String escuderia){

        int preu = 100;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes"))
            preu += 50;

        return preu;
    }

    public int calcularPuntuacioNoticia(String escuderia){

        int puntuacio = 4;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes"))
            puntuacio += 2;

        return puntuacio;
    }

    @Override
    public String toString(){
        return "Titular: " + titular;
    }
}
