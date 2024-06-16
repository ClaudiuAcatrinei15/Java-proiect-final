import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adauga Carte");
            System.out.println("2. Sterge Carte");
            System.out.println("3. Cauta Carte");
            System.out.println("4. Afiseaza Toate Cartile");
            System.out.println("5. Iesire");
            System.out.print("Alege o optiune: ");

            int optiune = scanner.nextInt();
            scanner.nextLine();  // consumă newline

            switch (optiune) {
                case 1:
                    System.out.print("Titlu: ");
                    String titlu = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("An Publicatie: ");
                    int an = scanner.nextInt();
                    scanner.nextLine();  // consumă newline

                    Carte carte = new Carte(titlu, autor, an);
                    biblioteca.adaugaCarte(carte);
                    break;
                case 2:
                    System.out.print("Titlu carte de sters: ");
                    String titluStergere = scanner.nextLine();
                    biblioteca.stergeCarte(titluStergere);
                    break;
                case 3:
                    System.out.print("Titlu carte de cautat: ");
                    String titluCautare = scanner.nextLine();
                    Carte carteGasita = biblioteca.cautaCarte(titluCautare);
                    if (carteGasita != null) {
                        System.out.println("Carte gasita: " + carteGasita);
                    } else {
                        System.out.println("Carte nu a fost gasita.");
                    }
                    break;
                case 4:
                    List<Carte> carti = biblioteca.getCarti();
                    for (Carte c : carti) {
                        System.out.println(c);
                    }
                    break;
                case 5:
                    System.out.println("La revedere!");
                    return;
                default:
                    System.out.println("Optiune invalida.");
                    break;
            }
        }
    }
}
