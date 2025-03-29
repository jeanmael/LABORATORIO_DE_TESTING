package CaesarShift;

import java.util.Scanner;

public class CaesarShiftCipherTest {
    public static void main(String[] args) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mensaje (solo minúsculas, sin espacios): ");
        String message = scanner.nextLine();

        System.out.print("Ingrese el desplazamiento: ");
        int shift = scanner.nextInt();

        String encryptedMessage = cipher.caesarShiftCipher(message, shift);
        System.out.println("Mensaje cifrado: " + encryptedMessage);

        scanner.close();
    }
}
