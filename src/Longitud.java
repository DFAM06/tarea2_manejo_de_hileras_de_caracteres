import java.util.Scanner;

public class Longitud {

    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la hilera de caracteres para saber su longitud o cantidad de caracteres.");
        String textoUsuario = scan.nextLine();

        System.out.println("\nLa cantidad de caracteres que contiene es: " + textoUsuario.length());
    }

}
