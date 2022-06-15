package n1ex1;

class Corda extends Instrument{

    //Bloc d'inicialització estàtic, s'inicialitza en carregar la classe
    static {
        System.out.println("Inic. estàtic - Corda");
    }

    //Bloc d'inicialització no estàtic
    {
        System.out.println("Inic. no estàtic - Corda");
    }

    protected Corda(String nom, float preu) {
        super(nom, preu);
    }

    public static void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }

}
