package n1ex1;

public abstract class Instrument {

    String nom;
    float preu;
    public Instrument(String nom, float preu){
        this.nom = nom;
        this.preu = preu;
    }

    static void tocar(){}

    public static void main(String[] args) {

        //Per carregar una classe podem:

        //Crear una instància d'una classe
        Vent violi = new Vent("Violi", 200);
        violi.tocar();

        //Accedir a un membre estàtic d'una classe
        Corda.tocar();

    }
}

class Vent extends Instrument{

    public Vent(String nom, float preu) {
        super(nom, preu);
    }

    static void tocar(){
        System.out.println("Està sonant un instrument de vent");
    }

}



class Percussio extends Instrument{

    public Percussio(String nom, float preu) {
        super(nom, preu);
    }

    static void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }
}
