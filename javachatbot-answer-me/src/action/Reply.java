package action;

import java.util.ArrayList;

public class Reply {
	
	static String[][][] data = AnswersData.getAswers();

	private static ArrayList<String> load(String id) {
		ArrayList<String> result = new ArrayList<>();
		String[] idList = id.split(" ");

		if(idList.length>1) {
			result.add("Estou em dúvida e reconheci mais de uma pergunta");
			result.add("ID's: "+idList[0]+" / "+idList[1]);
		} else {
			for(String[][] dataGroup : data) {
				if(dataGroup[0][0].equals(idList[0])) {
					for(String answers : dataGroup[4]) {
						result.add(answers);
					}
				}
			}
		}
		
		return result;
	};
	
	public static ArrayList<String> loadReply(String id){
		return load(id);
	}
}
