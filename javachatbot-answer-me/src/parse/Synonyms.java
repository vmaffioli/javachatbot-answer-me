package parse;

public class Synonyms {

	static String[][] synonyms = SynonymsData.getSynonyms();

	private static String synonymsReplace(String str) {
		String[] splitedStr = str.split(" ");

		for (String[] toReplace : synonyms) {
			for (String item : toReplace) {
				for (String word : splitedStr) {
					if (Normalize.get(item).equals(Normalize.get(word))) {
						str = str.replaceAll(item, toReplace[0]);
					}
				}
			}

		}
		return str;
	}

	public static String get(String str) {
		return synonymsReplace(str);
	}

}
