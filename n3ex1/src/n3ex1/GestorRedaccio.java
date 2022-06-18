package n3ex1;

import n3ex1.noticia.Noticia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class GestorRedaccio {

    private final List<Redactor> redactors;
    private final Scanner scanner;

    public GestorRedaccio(Scanner scanner) {
        this.scanner = scanner;
        this.redactors = new ArrayList<>();
    }

    public void introduirRedactor() {

        redactors.add(Redactor.crear(scanner));
        System.out.println("Redactor afegit\n");

    }

    private Optional<Redactor> findRedactor() {

        System.out.println("Introduïu nom del redactor: ");
        String nom = scanner.nextLine();
        return redactors.stream().filter(redactor -> redactor.getNom().equals(nom)).findFirst();

    }

    public void eliminarRedactor() {

        findRedactor().ifPresent(redactors::remove);
        System.out.println("Redactor esborrat\n");

    }

    public void introduirNoticia() {

        findRedactor().ifPresentOrElse(redactor -> {
            Noticia noticia = Noticia.crear(scanner);
            redactor.addNoticia(noticia);
            System.out.println("Notícia afegida\n");
        }, () -> System.out.println("No s'ha trobat el redactor\n"));


    }

    public void eliminarNoticia() {

        findRedactor().ifPresentOrElse(redactor -> {
            String titular = scanTitular();
            redactor.eliminarNoticia(titular);
            System.out.println("La notícia ha estat eliminada");
        }, () -> System.out.println("No s'ha trobat el redactor\n"));

    }

    private String scanTitular() {

        System.out.println("Introduïu titular: ");
        return scanner.nextLine();

    }

    public void mostraNoticies() {

        Optional<Redactor> redactor = findRedactor();
        redactor.ifPresentOrElse(Redactor::imprimirNoticies, () -> System.out.println("No s'ha trobat el redactor\n"));


    }

    public void imprimirPuntuacio(){
        findRedactor().ifPresentOrElse(redactor -> {
            String titular = scanTitular();
            Optional<Noticia> noticia = redactor.getNoticia(titular);
            int puntuacio = noticia.map(Noticia::calcularPuntuacioNoticia).orElse(0);
            System.out.println("La puntuació de la notícia és: " + puntuacio + " punts");
        },  () -> System.out.println("No s'ha trobat el redactor\n"));

    }

    public void imprimirPreu(){
        findRedactor().ifPresentOrElse(redactor -> {
            String titular = scanTitular();
            Optional<Noticia> noticia = redactor.getNoticia(titular);
            int preu = noticia.map(Noticia::calcularPreuNoticia).orElse(0);
            System.out.println("El preu de la notícia és: " + preu + "€");
        },  () -> System.out.println("No s'ha trobat el redactor\n"));

    }

}
