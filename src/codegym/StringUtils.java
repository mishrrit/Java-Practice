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
	System.out.println(isNullOrEmpty);
	boolean isPalindrome = StringUtils.Validator.isPalindrome("radar");
	System.out.println(isPalindrome);
	
	String capitalized = StringUtils.Formatter.capitalize("hello world");
	System.out.println(capitalized);
	String reversed = StringUtils.Formatter.reverse("Java");
	System.out.println(reversed);
	
	String encoded = StringUtils.Encoder.encodeBase64("secret");
	System.out.println(encoded);
	String decoded = StringUtils.Encoder.decodeBase64(encoded);
	System.out.println(decoded);
    }

}
