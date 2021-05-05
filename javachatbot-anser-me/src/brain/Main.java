package brain;

import java.util.*;

import action.Provider;
import parse.Parser;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter your question:");

		@SuppressWarnings("resource")
		String userInput = new Scanner(System.in).nextLine();	
		

		System.out.println(Provider.reply(Parser.call(userInput)));

		// outputs for tests
		System.out.println("user input: " + userInput);

	}

}
