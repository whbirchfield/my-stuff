
public class DecryptionKey {
	static char value;

	public static String decodeMessage() {
		String message = "";
		for (int j = 0; j < ArrayGenerator.encryptorGenerator().length; j++) {

			value = ArrayGenerator.encryptorGenerator()[j];

			decrypt();
			message = (message + value);
		}

		return message;

	}

	private static void decrypt() {
		switch (value) {
		case '1':
			value = 'a';
			break;
		case '2':
			value = 'b';
			break;
		case '{':
			value = 'c';
			break;
		case '4':
			value = 'd';
			break;
		case '5':
			value = 'e';
			break;
		case '6':
			value = 'f';
			break;
		case '7':
			value = 'g';
			break;
		case '8':
			value = 'h';
			break;
		case '9':
			value = 'i';
			break;
		case '0':
			value = 'j';
			break;
		case '$':
			value = 'k';
			break;
		case 'b':
			value = 'l';
			break;
		case 'c':
			value = 'm';
			break;
		case 'd':
			value = 'n';
			break;
		case 'e':
			value = 'o';
			break;
		case 'f':
			value = 'p';
			break;
		case 'g':
			value = 'q';
			break;
		case 'h':
			value = 'r';
			break;
		case '-':
			value = 's';
			break;
		case 'j':
			value = 't';
			break;
		case 'k':
			value = 'u';
			break;
		case 'l':
			value = 'v';
			break;
		case 'm':
			value = 'w';
			break;
		case 'n':
			value = 'x';
			break;
		case 'o':
			value = 'y';
			break;
		case ')':
			value = 'z';
			break;
		case '*':
			value = ' ';
			break;
		case ';':
			value = '.';
			break;
		case '%':
			value = '?';
			break;
		case '>':
			value = '!';
			break;
		case '<':
			value = '#';
			break;
		case '&':
			value = '@';
			break;
		case 'i':
			value = '9';
			break;
		case '+':
			value = '8';
			break;
		case '|':
			value = '7';
			break;
		case ':':
			value = '6';
			break;
		case '[':
			value = '5';
			break;
		case '}':
			value = '4';
			break;
		case '/':
			value = '3';
			break;
		case ']':
			value = '2';
			break;
		case '`':
			value = '1';
			break;
		case '~':
			value = '0';
			break;
		case '.':
			value = '\'';
			break;
		case '?':
			value = '\"';
			break;
		case '_':
			value = '$';
			break;
		}
	}
}
