package n1ex2;

public class Main {
    public static void main(String[] args) {

        //Invoquem el mètode no estàtic
        Cotxe cotxe1 = new Cotxe("Astra", 80);
        cotxe1.accelerar();

        //Invoquem el mètode estàtic (no cal instanciar la classe)
        Cotxe.frenar();

    }
}