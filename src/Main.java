import java.util.Scanner;
public class Main {

    public static String textoUsuario;
    public static String opcionUsuario;
    public static boolean continuar = true;

    public static void main(String[] agrs){

        Scanner scan = new Scanner(System.in);

        while (continuar) {
            System.out.println("\nEscriba el número (1) si deseas saber la longitud de una hilera de carcteres"
                + "\nEscriba el número (2) si deseas ver el primer y último caracter de una hilera de caracteres"
                + "\nEscriba el número (3) si deseas comparar 2 hileras de caracteres"
                + "\nEscriba el número (4) si deseas convertir la hilera de caracteres en mayúsculas y minúsculas"
                + "\nEscriba el número (5) si deseas encontrar una palabra dentro de una hilera de caracteres"
                + "\nEscriba el número (6) si deseas contar las vocales de una hilera de caracteres"
                + "\nEscriba el número (7) si deseas invertir una hilera de caracteres"
                + "\nEscriba el número (8) si deseas escribir una contraseña"
            );
            opcionUsuario = scan.next();
            scan.nextLine();

            switch (opcionUsuario) {
                case "1":
                    Longitud.ejecutar(scan);

                    break;

                case "2":
                    PrimerUltimoCaracter.ejecutar(scan);
                    break;

                case "3":

                    CompararHileras.ejecutar(scan);

                    break;

                case "4":

                    MayusMinus.ejecutar(scan);

                    break;

                case "5":
                    BuscarPalabra.ejecutar(scan);
                    
                    break;

                case "6":
                    
                    ContarVocales.ejecutar(scan);

                    break;


                case "7":

                    Invertir.ejecutar(scan);
                    
                    break;


                case "8":

                    Contrasenna.ejecutar(scan);
                    
                    break;


                default:
                    System.out.println("Gracias por usar el programa.");
                    continuar = false;
                    break;
            }
        }        
    }
}
