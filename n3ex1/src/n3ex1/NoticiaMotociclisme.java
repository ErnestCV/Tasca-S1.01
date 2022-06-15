package n3ex1;

import java.util.Scanner;

public class NoticiaMotociclisme extends Noticia {

    String equip;
    static final String tipus = "motociclisme";

    NoticiaMotociclisme(String titular, String text, String equip){
        super(titular, text);
        this.equip = equip;

    }

    public static String getEquip(Scanner scanner){
        System.out.println("Introduïu a quin equip pertany el vehicle: ");
        return scanner.nextLine();
    }

    public int calcularPreuNoticia(String equip){

        int preu = 100;
        if (equip.equals("Honda") || equip.equals("Yamaha"))
            preu += 50;

        return preu;
    }

    public int calcularPuntuacioNoticia(String equip){

        int puntuacio = 3;
        if (equip.equals("Honda") || equip.equals("Yamaha"))
            puntuacio += 3;

        return puntuacio;
    }

    @Override
    public String toString(){
        return "Titular: " + titular;
    }
}