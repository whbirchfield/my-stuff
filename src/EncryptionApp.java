import java.util.Scanner;

public class EncryptionApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a message: ");
		String encryptedMessage = EncryptionKey.assignmentEncryption(input.nextLine().toLowerCase());

		System.out.print("\nHere is your new encoded message: ");
		System.out.println(encryptedMessage + "\n");

		System.out.print("Would you like to decode this message? (Y/N): ");
		String choice = input.nextLine();

		if (choice.equalsIgnoreCase("y")) {
			System.out.println(DecryptionKey.decodeMessage(encryptedMessage));
		} else {
			System.out.println("\nThank you for using the encoder!");
		}
		input.close();
	}
}