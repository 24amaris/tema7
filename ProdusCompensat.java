public class ProdusCompensat extends Produs {
    
    private double coeficient;

    public ProdusCompensat(String cod, String nume, double pretDeBaza, int cantitate, double coeficient) {
        super(cod, nume, pretDeBaza, cantitate);
        this.coeficient = coeficient;
    }

    public double getPret() {
        return pretDeBaza * coeficient;
    }
}
