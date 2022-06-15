package n1ex2;

public class Cotxe {

    private static final String marca;
    private static String model;
    private final int potencia;

    //Inicialitzem la marca i el model. Seran comuns per a tots els cotxes. No podrem modificar la marca

    static {
        marca = "Opel";
        model = "Corsa";
    }

    //Constructor amb model i potencia
    protected Cotxe(String model, int potencia) {
        this.model = model;
        this.potencia = potencia;
    }

    //Mètode estàtic
    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    //Mètode no estàtic
    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

}


