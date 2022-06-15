package n1ex1;

public abstract class Instrument {

    //Bloc d'inicialització estàtic, s'inicialitza en carregar la classe
    // -> Inicialització de la classe
    static {
        System.out.println("Inic. estàtic - Instrument");
    }

    //Bloc d'inicialització no estàtic, s'inicialitza en instanciar la classe
    // -> Inicialització de l'objecte
    {
        System.out.println("Inic. no estàtic - Instrument");
    }

    //S'inicialitza la classe primària primer, després la secundària

    private String nom;
    private float preu;
    protected Instrument(String nom, float preu){
        this.nom = nom;
        this.preu = preu;
    }

    public static void tocar() {
    }

    public static void main(String[] args) {

        //Per carregar una classe podem:

        //Crear una instància d'una classe
        Vent violi = new Vent("Violi", 200);
        violi.tocar();

        //Accedir a un membre estàtic d'una classe
        Corda.tocar();

    }
}



