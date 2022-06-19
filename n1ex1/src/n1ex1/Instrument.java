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
    public Instrument(String nom, float preu){
        this.nom = nom;
        this.preu = preu;
    }

    public abstract void tocar();

    public static void main(String[] args) {

        //Crear una instància d'una classe
        Vent flauta = new Vent("Flauta", 200);
        flauta.tocar();

        Corda violi = new Corda("Violi", 400);


    }
}



