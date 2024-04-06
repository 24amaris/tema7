public abstract class Produs {
    private String cod, nume;
    private double pretDeBaza;
    private int cantitate;

    public Produs(String cod, String nume, double pretDeBaza, int cantitate) {
        this.cod = cod;
        this.nume = nume;
        this.pretDeBaza = pretDeBaza;
        this.cantitate = cantitate;
    }

    public abstract double getPret();

    public String getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }

    public int getCantitate() {
        return cantitate;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double getPretDeBaza() {
        return pretDeBaza;
    }

  
}
