package n2ex1;

public class Telefon {

    final String marca;
    final String model;

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