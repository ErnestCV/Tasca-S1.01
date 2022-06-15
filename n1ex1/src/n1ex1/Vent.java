package n1ex1;

class Vent extends Instrument{

    protected Vent(String nom, float preu) {
        super(nom, preu);
    }

    public static void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }

}
