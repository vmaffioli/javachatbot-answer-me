package action;


public class Provider {
	
	
	private static String analize(String input) {
		
		return DrawProtocol.getProtocol(
					ValidateKeys.getValidation(input)
				);
	}
	
	
	
	
	public static String reply(String input) {
		
		return analize(input);
	};

}
