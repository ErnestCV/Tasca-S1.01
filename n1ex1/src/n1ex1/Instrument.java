package n1ex1;

public abstract class Instrument {

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



