package parse;

public class Parser {
	
	private static String parserCaller(String str) {
		return Normalize.get(Synonyms.get(str));
	};
	
	public static String call(String str) {
		return parserCaller(str);
	};

}
