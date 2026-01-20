import java.util.Scanner;

public interface BuscarPalabra {
    public static void ejecutar(Scanner scan) {
        System.out.println("\nEscriba la hilera de caracteres.");
        String textoUsuario = scan.nextLine();

        System.out.println("\nEscriba la palabra a buscar dentro de la hilera de caracteres.");
        String palabraABuscar = scan.next();

        if (textoUsuario.contains(palabraABuscar)) {
            System.out.println("\nLa palabra (" + palabraABuscar + ") está en la hilera de caracteres: \n" + textoUsuario);
        } else {
            System.out.println("\nLa palabra (" + palabraABuscar + ") NO está en la hilera de caracteres: \n" + textoUsuario);
        }
    }
}
