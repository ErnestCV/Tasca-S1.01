package n3ex1;

import n3ex1.noticia.Noticia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Redactor {

    private static final float SOU = 1500;
    private final String nom;
    private final String DNI;
    private final List<Noticia> noticies = new ArrayList<>();

    public Redactor(String nom, final String DNI) {
        this.nom = nom;
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public Optional<Noticia> getNoticia(String titular) {
        return noticies.stream().filter(noticia -> noticia.getTitular().equals(titular)).findFirst();
    }

    public void addNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public void eliminarNoticia(String titular) {
        Optional<Noticia> noticia = getNoticia(titular);
        noticia.ifPresent(noticies::remove);

    }

    public static Redactor crear(Scanner scanner) {
        System.out.println("Introduïu nom del redactor: ");
        String nom = scanner.nextLine();
        System.out.println("Introduïu DNI del redactor: ");
        String DNI = scanner.nextLine();

        return new Redactor(nom, DNI);
    }

    public void imprimirNoticies() {

        int counter = 1;

        if (noticies.size() == 1) {
            System.out.println("Aquest redactor té " + noticies.size() + " notícia:");
        } else {
            System.out.println("Aquest redactor té " + noticies.size() + " notícies:");
        }

        for (Object noticia : noticies) {
            System.out.print("Notícia " + counter + " - ");
            counter++;
            System.out.println(noticia);
        }
    }


}