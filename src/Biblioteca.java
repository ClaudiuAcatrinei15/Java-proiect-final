import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Carte> carti;

    public Biblioteca() {
        this.carti = new ArrayList<>();
    }

    public void adaugaCarte(Carte carte) {
        carti.add(carte);
    }

    public void stergeCarte(String titlu) {
        carti.removeIf(carte -> carte.getTitlu().equalsIgnoreCase(titlu));
    }

    public Carte cautaCarte(String titlu) {
        for (Carte carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu)) {
                return carte;
            }
        }
        return null;
    }

    public List<Carte> getCarti() {
        return new ArrayList<>(carti);
    }
}
