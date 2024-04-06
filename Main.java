public class Main {
    public static void main(String[] args) {
        Depozit depozit = new Depozit();
        depozit.adaugaProdus(new ProdusCompensat("001", "Produs1", 100.0, 5, 0.8));
        depozit.adaugaProdus(new ProdusNecompensat("002", "Produs2", 200.0, 3));
        depozit.adaugaProdus(new ProdusCompensat("001", "Produs1", 100.0, 2, 0.8));

        depozit.tiparesteInventar();
    }  
}
