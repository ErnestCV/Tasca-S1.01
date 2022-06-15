package n3ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Redactor {

    String nom;
    final String DNI;
    static float sou = 1500;

    ArrayList<Object> noticies = new ArrayList<>();

    public Redactor(String nom, final String DNI) {
        this.nom = nom;
        this.DNI = DNI;
    }

    public static String getRedactor(Scanner scanner){
        System.out.println("Introduïu nom del redactor: ");
        return scanner.nextLine();
    }

    public static String getDNI(Scanner scanner){
        System.out.println("Introduïu DNI del redactor: ");
        return scanner.nextLine();
    }


}