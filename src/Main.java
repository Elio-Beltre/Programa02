import java.util.Scanner;

/** Programa que calcule la conversion de dolar a pesos.
 * /
 */
public class Main {
    public static void main(String[] args) {
        final double TASA_DOLLAR = 56.25;
        double monto;
        double total;
        String usuario;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        usuario = scanner.nextLine();
        System.out.print("Ingrese el monto en dolares que desea convertir en peso: ");
        monto = scanner.nextDouble();


        total = TASA_DOLLAR * monto;
        System.out.println("Bienvenido: " + usuario);
        System.out.println("La conversio es: RD$ "+ total);

    }
}