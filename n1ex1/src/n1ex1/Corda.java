package n1ex1;

class Corda extends Instrument{

    protected Corda(String nom, float preu) {
        super(nom, preu);
    }

    public static void tocar(){
        System.out.println("Està sonant un instrument de corda");
    }

}
