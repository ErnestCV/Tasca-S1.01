package n1ex1;

class Percussio extends Instrument{

    protected Percussio(String nom, float preu) {
        super(nom, preu);
    }

    public static void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }
}