package brain;

import java.util.*;

import action.Provider;
import parse.Parser;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter your question:");

		@SuppressWarnings("resource")
		String userInput = new Scanner(System.in).nextLine();	
		


		// outputs for tests
				
		for(String answer : Provider.reply(Parser.call(userInput))) {
			System.out.println(answer);
		};

	}

}
