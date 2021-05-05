package action;

import java.util.ArrayList;

public class ValidateKeys {

	private static ArrayList<String> validation(String input) {
		final String[][][] data = AnswersData.getAswers();
		Boolean validateKeyGroup1 = false;
		Boolean validateKeyGroup2 = false;
		ArrayList<String> result = new ArrayList<>();

		for (String[][] dataGroup : data) {

			for (String dataKey : dataGroup[1]) {
				for (String word : input.split(" ")) {

					if (word.equals(dataKey)) {
						validateKeyGroup1 = true;
					}
				}
			}
			for (String dataKey : dataGroup[2]) {
				for (String word : input.split(" ")) {

					if (word.equals(dataKey)) {
						validateKeyGroup2 = true;
					}
				}
			}

			if ((validateKeyGroup1) && (validateKeyGroup2)) {
				result.add(dataGroup[0][0]);
			}
			
		}

		return result;
	}

	public static ArrayList<String> getValidation(String input) {
		return validation(input);
	}

}
