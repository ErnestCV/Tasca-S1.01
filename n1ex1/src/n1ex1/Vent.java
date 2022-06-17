package n1ex1;

public class Vent extends Instrument{

    //Bloc d'inicialització estàtic, s'inicialitza en carregar la classe
    static {
        System.out.println("Inic. estàtic - Vent");
    }

    //Bloc d'inicialització no estàtic
    {
        System.out.println("Inic. no estàtic - Vent");
    }

    public Vent(String nom, float preu) {
        super(nom, preu);
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }

}
