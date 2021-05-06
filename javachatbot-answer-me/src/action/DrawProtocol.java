package action;

import java.util.ArrayList;

public class DrawProtocol {

	private static String isDraw(ArrayList<String> list, String input) {
		final String[][][] data = AnswersData.getAswers();
		ArrayList<String> matchData = new ArrayList<>();
		String[] sGreaterMatch = { "empty", "0" };
		String result = "";
		int greaterMatch;

		if (list.size() < 0) {
			result = list.get(0);
		} else {
			for (String id : list) {
				for (String[][] dataGroups : data) {
					if (dataGroups[0][0].equals(id)) {
						ArrayList<Integer> iEachMatch = new ArrayList<>();
						int iMatch = 0;
						for (String questionTemplate : dataGroups[3]) {
							String[] splitedQTemplate = questionTemplate.split(" ");
							String[] splitedQInput = input.split(" ");

							for (String inputWord : splitedQInput) {
								for (String inputQTemplate : splitedQTemplate) {
									if (inputWord.equals(inputQTemplate)) {
										iMatch++;
									}
								}
							}
							iEachMatch.add(iMatch);
							iMatch = 0;
						}

						greaterMatch = -1;
						for (int i : iEachMatch) {
							if (greaterMatch < 0) {
								greaterMatch = i;
							} else {
								if (i > greaterMatch) {
									greaterMatch = i;
								}
							}
						}
						matchData.add(dataGroups[0][0] + "%" + greaterMatch);
					}
				}
			}
		}
		for (String str : matchData) {
			String[] iGet = str.split("%");
			if (Integer.parseInt(iGet[1]) < 0) {
				sGreaterMatch[0] = iGet[0];
				sGreaterMatch[1] = iGet[1];

			} else {
				if (Integer.parseInt(iGet[1]) > Integer.parseInt(sGreaterMatch[1])) {
					sGreaterMatch[0] = iGet[0];
					sGreaterMatch[1] = iGet[1];
				} else if (Integer.parseInt(iGet[1]) == Integer.parseInt(sGreaterMatch[1])) {
					sGreaterMatch[0] = sGreaterMatch[0]+" "+iGet[0]+" ";
					sGreaterMatch[1] = iGet[1];
				}
			}
		}
		if(!sGreaterMatch[0].equals("draw")) {
			result = sGreaterMatch[0];
		};
		
		return result;
	}

	public static String getProtocol(ArrayList<String> list, String input) {
		return isDraw(list, input);
	}
}
