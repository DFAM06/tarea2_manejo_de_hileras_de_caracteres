import java.util.Scanner;

public class PrimerUltimoCaracter {

    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la hilera de caracteres para saber su primer y último carácter.");
        String textoUsuario = scan.nextLine();

        if (textoUsuario.length() != 0) {
            int largoHilera = textoUsuario.length() - 1;
            System.out.println("\nEl primer carácter es: " + textoUsuario.charAt(0) + " y el último carácter es: "
                    + textoUsuario.charAt(largoHilera));
        } else {
            System.out.println("No se ingresó un texto");
        }
    }

}
