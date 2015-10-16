
public class EncryptionKey {

	public static String assignmentEncryption(String userOriginalMessage) {

		String encryptedMessage = "";
		ArrayGenerator ag = new ArrayGenerator();

		char[] arrayGenerator = ag.arrayGenerator(userOriginalMessage);

		for (int j = 0; j < arrayGenerator.length; j++) {

			char value = arrayGenerator[j];

			encrypt(value);
			encryptedMessage = (encryptedMessage + encrypt(value));
		}

		return encryptedMessage;
	}

	private static char encrypt(char value) {
		switch (value) {
		case 'a':
			value = '1';
			break;
		case 'b':
			value = '2';
			break;
		case 'c':
			value = '{';
			break;
		case 'd':
			value = '4';
			break;
		case 'e':
			value = '5';
			break;
		case 'f':
			value = '6';
			break;
		case 'g':
			value = '7';
			break;
		case 'h':
			value = '8';
			break;
		case 'i':
			value = '9';
			break;
		case 'j':
			value = '0';
			break;
		case 'k':
			value = '$';
			break;
		case 'l':
			value = 'b';
			break;
		case 'm':
			value = 'c';
			break;
		case 'n':
			value = 'd';
			break;
		case 'o':
			value = 'e';
			break;
		case 'p':
			value = 'f';
			break;
		case 'q':
			value = 'g';
			break;
		case 'r':
			value = 'h';
			break;
		case 's':
			value = '-';
			break;
		case 't':
			value = 'j';
			break;
		case 'u':
			value = 'k';
			break;
		case 'v':
			value = 'l';
			break;
		case 'w':
			value = 'm';
			break;
		case 'x':
			value = 'n';
			break;
		case 'y':
			value = 'o';
			break;
		case 'z':
			value = ')';
			break;
		case ' ':
			value = '*';
			break;
		case '.':
			value = ';';
			break;
		case '?':
			value = '%';
			break;
		case '!':
			value = '>';
			break;
		case '#':
			value = '<';
			break;
		case '@':
			value = '&';
			break;
		case '9':
			value = 'i';
			break;
		case '8':
			value = '+';
			break;
		case '7':
			value = '|';
			break;
		case '6':
			value = ':';
			break;
		case '5':
			value = '[';
			break;
		case '4':
			value = '}';
			break;
		case '3':
			value = '/';
			break;
		case '2':
			value = ']';
			break;
		case '1':
			value = '`';
			break;
		case '0':
			value = 'a';
		case '\'':
			value = '~';
			break;
		case '\"':
			value = '?';
			break;
		case '$':
			value = '_';
			break;
		}
		return value;
	}

}
