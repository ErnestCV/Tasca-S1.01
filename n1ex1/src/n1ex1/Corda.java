package n1ex1;

class Corda extends Instrument{

    public Corda(String nom, float preu) {
        super(nom, preu);
    }

    static void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }

}
