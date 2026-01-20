import java.util.Scanner;

public class CompararHileras {
    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la primera hilera de caracteres a comparar.");
        String textoUsuario = scan.nextLine();

        System.out.println("\nEscriba la segunda hilera de caracteres a comparar.");
        String textoUsuarioDos = scan.nextLine();

        if (textoUsuario.equalsIgnoreCase(textoUsuarioDos)) {
            System.out.println("\nLa primera hilera de caracteres es equivalente a la segunda hilera de caracteres");
        } else {
            System.out.println("\nLa primera hilera de caracteres NO es equivalente a la segunda hilera de caracteres");
        }
    }
}
