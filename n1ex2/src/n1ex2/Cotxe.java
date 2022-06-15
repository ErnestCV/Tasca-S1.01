package n1ex2;

public class Cotxe {

    static final String marca;
    static String model;
    final int potencia;

    //Inicialitzem la marca i el model. Seran comuns per a tots els cotxes. No podrem modificar la marca

    static {
        marca = "Opel";
        model = "Corsa";
    }

    //La potència i el model es poden inicialitzar al constructor

    public Cotxe() {
        potencia = 60;
        model = "Astra";
    }

    //Constructor amb model i potencia
    public Cotxe(String model, int potencia) {
        this.model = model;
        this.potencia = potencia;
    }

    //Mètode estàtic
    static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    //Mètode no estàtic
    void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

}

class Main {
    public static void main(String[] args) {

        //Invoquem el mètode no estàtic
        Cotxe cotxe1 = new Cotxe();
        cotxe1.accelerar();

        //Invoquem el mètode estàtic (no cal instanciar la classe)
        Cotxe.frenar();

    }
}
