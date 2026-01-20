import java.util.Scanner;

public class ContarVocales {
    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la hilera de caracteres.");
        String textoUsuario = scan.nextLine().toLowerCase();

        int cantidadVocales = 0;

        for (int i = 0; i < textoUsuario.length(); i++) {

            char actChar = textoUsuario.charAt(i);

            if (actChar == 'a' || actChar == 'e' || actChar == 'i' || actChar == 'o' || actChar == 'u') {
                cantidadVocales++;
            }

        }

        if (cantidadVocales != 1) {
            System.out.println("\nLa hilera de caracteres tiene " + cantidadVocales + " vocales");
        } else {
            System.out.println("\nLa hilera de caracteres tiene " + cantidadVocales + " vocal");
        }
    }
}
