package codegym;

public class StringUtils {

    public static class Validator {
	public static boolean isNullOrEmpty(String str) {
	    return true;
	}

	public static boolean isPalindrome(String str) {
	    return true;
	}
    }

    public static class Formatter {

	public static String capitalize(String str) {
	    return str;
	}

	public static String reverse(String str) {
	    return str;
	}

    }

    public static class Encoder {
	public static String encodeBase64(String str) {
	    return str;
	}

	public static String decodeBase64(String str) {
	    return str;
	}

    }

    public static void main(String[] args) {
	boolean isNullOrEmpty = StringUtils.Validator.isNullOrEmpty("Hello");
	boolean isPalindrome = StringUtils.Validator.isPalindrome("radar");

	String capitalized = StringUtils.Formatter.capitalize("hello world");
	String reversed = StringUtils.Formatter.reverse("Java");

	String encoded = StringUtils.Encoder.encodeBase64("secret");
	String decoded = StringUtils.Encoder.decodeBase64(encoded);

    }

}
