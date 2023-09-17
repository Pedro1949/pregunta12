import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero?: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero par.");
        } else {
            System.out.println("Numero impar.");
        }

        if (numero % 5 == 0) {
            System.out.println("Multiplo de 5.");
        } else {
            System.out.println("No es multiplo de 5.");
        }
    }
}
