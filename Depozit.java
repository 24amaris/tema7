import java.util.ArrayList;
import java.util.List;

public class Depozit {
    private List<Produs> produse;

    public Depozit() {
        produse = new ArrayList<>();
    }

    public void adaugaProdus(Produs produs) {
        for (Produs p : produse) {
            if (p.getCod().equals(produs.getCod())) {
                p.setCantitate(p.getCantitate() + produs.getCantitate());
                return;
            }
        }
        produse.add(produs);
    }

    public void tiparesteInventar() {
        for (Produs p : produse) {
            System.out.println("Cod: " + p.getCod() + ", Nume: " + p.getNume() + ", Pret: " + p.getPret() + ", Cantitate: " + p.getCantitate());
        }
    }
}
