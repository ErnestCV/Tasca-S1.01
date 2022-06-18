package n3ex1.noticia;

import java.util.Scanner;

public class NoticiaMotociclisme extends Noticia {

    private final String equip;

    NoticiaMotociclisme(String titular, String text, String equip){
        super(titular, text);
        this.equip = equip;

    }

    @Override
    public int calcularPreuNoticia(){

        int preu = 100;
        if (equip.equals("Honda") || equip.equals("Yamaha"))
            preu += 50;

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia(){

        int puntuacio = 3;
        if (equip.equals("Honda") || equip.equals("Yamaha"))
            puntuacio += 3;

        return puntuacio;
    }

    public static NoticiaMotociclisme crearNoticiaMotociclisme(Scanner scanner, String titular, String text) {

        System.out.println("Introduïu a quin equip pertany el vehicle: ");
        String equip = scanner.nextLine();

        return new NoticiaMotociclisme(titular, text, equip);

    }

    @Override
    public String toString(){
        return "Titular: " + titular;
    }
}