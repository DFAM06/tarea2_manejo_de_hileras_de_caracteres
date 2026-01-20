import java.util.Scanner;

public class Contrasenna {
    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la contraseña.");
        String textoUsuario = scan.nextLine();
        String textoUsuarioComparar = textoUsuario.toLowerCase();

        if (textoUsuario.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
        } else {

            if (textoUsuario.equals(textoUsuarioComparar)) {
                System.out.println("La contraseña debe tener al menos 1 mayúscula");
            } else {
                System.out.println("La contraseña es válida");
            }

        }
    }
}
