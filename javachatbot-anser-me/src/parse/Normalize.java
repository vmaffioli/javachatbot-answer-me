package parse;



public class Normalize {

	private static String removeNonDigits(String str) {
		return str.replaceAll("[^a-zZ-Z1-9 ]", "");
	}

	private static String tolowerCase(String str) {
		return str.toLowerCase();
	}

	private static String removeSpecialChar(String str) {
		return str.replaceAll("ÄÅÁÂÀÃäáâàãÉÊËÈéêëèÍÎÏÌíîïìÖÓÔÒÕöóôòõÜÚÛüúûùÇç",
				"AAAAAAaaaaaEEEEeeeeIIIIiiiiOOOOOoooooUUUuuuuCc");
	}

	public static String get(String str) {
		return removeNonDigits(tolowerCase(removeSpecialChar(str)));
	}

}
