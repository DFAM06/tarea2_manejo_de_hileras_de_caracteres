import java.util.Scanner;

public class Invertir {
    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la hilera de caracteres.");
        String textoUsuario = scan.nextLine();

        String textoUsuarioInvertido = "";

        for (int i = (textoUsuario.length() - 1); i >= 0; i--) {

            textoUsuarioInvertido += textoUsuario.charAt(i);

        }

        System.out.println("La hilera de caracteres invertida: " + textoUsuarioInvertido);
    }
}
