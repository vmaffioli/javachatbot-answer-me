package action;

public class AnswersData {
	
	private static final String[][][] answers = {
			{
				{
					"001ansall", // [n][0][0] id da resposta
					"Perguntas que o bot consegue receber" //[n][1] descrição da  resposta
					},
				{
					"voce", // [n][1][n] keys 1
					"responder",
					"respostas",
					"perguntas",
					"falar"
					},
				{
					"sabe", // [n][2][n] keys 2
					"consegue",
					"conhece",
					"pode"
					},
				{
					"O que voce sabe responder",  // [n][3][n] questions patterns 
					"Quais perguntas voce sabe responder ",
					"O que voce consegue responder",
					"Quais perguntas voce consegue responder",
					"Quais perguntas voce conhece",
					"Quais respostas voce conhece",
					"O que voce pode responder",
					"Quais perguntas voce pode responder"
					},
				{
					"Atualmente eu sei responder:", // [n][4][n]
					"Qual é o meu nome",
					"e Respostas que eu conheço",
					"Ainda sou um prototipo, mas você pode inserir respostas novas em package>action/AnswersData.java"
				}
			},
			{
				{
					"002mynam", // [n][0][0] titulo da resposta
					"O nome do bot" //[n][1] descrição da  resposta
					},
				{
					"nome", // [n][1][n] keys 1
					"chama",
					"voce"
					},
				{
					"qual", // [n][2][n] keys 2
					"como",
					"quem"
					},
				{
					"como voce se chama",  // [n][3][n] questions patterns 
					"qual e o seu nome",
					"como e o seu nome",
					"qual seu nome",
					"quem e voce"
					},
				{
					"Meu nome é", // [n][4][n] answers
					"JavaChatbot-answer-me",
					"Prazer! :)"
				}
			}
	};

	
	public static String[][][] getAswers() {
		return answers;
	}
	
	
	
//                          data template
//	{
//		{
//			"", // [n][0][0] titulo da resposta
//			"" //[n][1] descrição da  resposta
//			},
//		{
//			"", // [n][1][n] keys 1
//			""
//			},
//		{
//			"", // [n][2][n] keys 2
//			""
//			},
//		{
//			"",  // [n][3][n] questions patterns 
//			""
//			},
//		{
//			"", // [n][4][n] answers
//			""
//		}
//	},
	
};

