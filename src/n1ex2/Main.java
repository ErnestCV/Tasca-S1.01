package n1ex2;

class Main {
    public static void main(String[] args) {

        //Invoquem el mètode no estàtic
        Cotxe cotxe1 = new Cotxe("Astra", 90);
        cotxe1.accelerar();

        //Invoquem el mètode estàtic (no cal instanciar la classe)
        Cotxe.frenar();

    }
}