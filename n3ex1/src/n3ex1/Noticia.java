package n3ex1;

import java.util.Scanner;

public abstract class Noticia {

    String titular = "";
    String text = "";
    int puntuacio;
    int preu;

    public Noticia(String titular, String text) {
        this.titular = titular;
        this.text = text;
    }

    //public abstract String identifyNoticia();

    public static String getType(Scanner scanner){
        System.out.println("Introduïu tipus de notícia: futbol - basquet - tenis - f1 - motociclisme: ");
        return scanner.nextLine();
    }

    public static String getTitular(Scanner scanner){
        System.out.println("Introduïu el titular de la notícia: ");
        return scanner.nextLine();
    }

    public static String getText(Scanner scanner){
        System.out.println("Introduïu el text de la notícia: ");
        String text = scanner.nextLine();
        return text;
    }

}


