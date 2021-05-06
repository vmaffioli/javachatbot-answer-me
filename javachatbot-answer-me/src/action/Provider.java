package action;

import java.util.ArrayList;

public class Provider {
	
	
	private static ArrayList<String> analize(String input) {
		
		return  Reply.loadReply(
					DrawProtocol.getProtocol(
						ValidateKeys.getValidation(input), input
						)
				);
	};
	
	
	
	
	public static ArrayList<String> reply(String input) {
		
		return analize(input);
	};

}
