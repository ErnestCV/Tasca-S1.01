package n2ex1;

public class Telefon {

    private final String marca;
    private final String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    void trucar(String numTelefon){

        System.out.println("S'està trucant al: " + numTelefon);

    }

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Xiaomi", "12 Pro");

        smartphone.alarma();
        smartphone.fotografiar();
        smartphone.trucar("666666666");

    }

}