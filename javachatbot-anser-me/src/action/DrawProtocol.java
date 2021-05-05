package action;

import java.util.ArrayList;

public class DrawProtocol {

	private static String isDraw(ArrayList<String> list) {
		final String[][][] data = AnswersData.getAswers();
		String result = "";

		if (list.size() < 0) {
			result = list.get(0);
		} else {
			for (String id : list) {
				for (String[][] dataGroups : data) {
					if (dataGroups[0][0].equals(id)) {
						for (String questionTemplate : dataGroups[3]) {
							// parei aqui,  comparando os templates com o input para aplicar drawprotocol
						}
					}
				}
			}
		}

		return result;
	}

	public static String getProtocol(ArrayList<String> list) {
		return isDraw(list);
	}
}
