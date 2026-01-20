import java.util.Scanner;

public class MayusMinus {
    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la hilera de caracteres.");
        String textoUsuario = scan.nextLine();

        System.out.println("\nLa hilera de caracteres original: \n" + textoUsuario);

        System.out.println("\nLa hilera de caracteres en mayúsculas: \n" + textoUsuario.toUpperCase());

        System.out.println("\nLa hilera de caracteres en minúsculas: \n" + textoUsuario.toLowerCase());
    }
}
