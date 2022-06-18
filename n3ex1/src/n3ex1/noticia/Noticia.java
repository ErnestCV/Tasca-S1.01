package n3ex1.noticia;

import n3ex1.TipusNoticia;

import java.util.Scanner;

public abstract class Noticia {

    protected String titular;
    protected String text;

    public Noticia(String titular, String text) {
        this.titular = titular;
        this.text = text;
    }

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }


    public abstract int calcularPreuNoticia();

    public abstract int calcularPuntuacioNoticia();

    public static Noticia crear(Scanner scanner) {

        System.out.println("Introduïu tipus de notícia: futbol - basquet - tenis - f1 - motociclisme: ");
        TipusNoticia tipus = TipusNoticia.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Introduïu el titular de la notícia: ");
        String titular = scanner.nextLine();
        System.out.println("Introduïu el text de la notícia: ");
        String text = scanner.nextLine();

        switch (tipus) {
            case FUTBOL -> {
                return NoticiaFutbol.crearNoticiaFutbol(scanner, titular, text);
            }
            case BASQUET -> {
                return NoticiaBasquet.crearNoticiaBasquet(scanner, titular, text);
            }
            case TENIS -> {
                return NoticiaTenis.crearNoticiaTenis(scanner, titular, text);
            }
            case F1 -> {
                return NoticiaF1.crearNoticiaF1(scanner, titular, text);
            }
            case MOTOCICLISME -> {
                return NoticiaMotociclisme.crearNoticiaMotociclisme(scanner, titular, text);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Titular: " + titular;
    }
}


