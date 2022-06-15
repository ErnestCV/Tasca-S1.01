package n3ex1;

import java.util.ArrayList;

public class Finder {

    public static Redactor redactorFinder(ArrayList<Redactor> redactors, String name){

        return redactors.stream().filter(redactor -> redactor.nom.equals(name)).findFirst().orElse(null); //orElseGet()?

    }

}

