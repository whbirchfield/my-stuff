
public class ArrayGenerator {
static String userInput;

	
	public static char[] arrayGenerator(){
		char [] userInputArray = userInput.toCharArray();
		return userInputArray;
		
	}
	public static char[] encryptorGenerator(){
		char [] encryptionKeyArray = EncryptionKey.assignmentEncryption().toCharArray();
		return encryptionKeyArray;
	}
}
