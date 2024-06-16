public class Carte {
    private String titlu;
    private String autor;
    private int anPublicatie;

    public Carte(String titlu, String autor, int anPublicatie) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnPublicatie() {
        return anPublicatie;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", anPublicatie=" + anPublicatie +
                '}';
    }
}
