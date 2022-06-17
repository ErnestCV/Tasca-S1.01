package n1ex1;

class Percussio extends Instrument{

    //Bloc d'inicialització estàtic, s'inicialitza en carregar la classe
    static {
        System.out.println("Inic. estàtic - Percussio");
    }

    //Bloc d'inicialització no estàtic
    {
        System.out.println("Inic. no estàtic - Percussio");
    }

    protected Percussio(String nom, float preu) {
        super(nom, preu);
    }

    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }
}