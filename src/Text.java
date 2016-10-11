
public class Text {
	
	String start;
	String turn;
	String end;
	Field hejsa;

	Field[] fieldDescription =
		{
			new Field(" ", 0),
			new Field(" ", 0),
			new Field("Tower", 250),
			new Field("Crater", -100),
			new Field("Palace Gates", +100),
			new Field("Cold Desert", -20),
			new Field("Walled city", +180),
			new Field("Monastery", 0),
			new Field("Black cave", -70),
			new Field("Huts in the mountain", +60),
			new Field("The Werewall", -80),
			new Field("The pit", -50),
			new Field("Goldmine", +650),
		};
	
	public String getFieldDescription(int point)
	{ 
		
		return fieldDescription[point].getFieldText();
		
	}
	public int getFieldValue(int point)
	{
		return fieldDescription[point].getValue();
	}

	
	public void startDescription()
	{
		
		System.out.println("Hello Players! today we will be playing a game of dices");
		System.out.println("The object of the game is to get 3000money!!");
		System.out.println("You will each start with 1000money");
		System.out.println("Now we have predetermined names for you guys!");
		System.out.println("Player 1 will be named: Bojack Horseman");
		System.out.println("Player 2 will be named: Richie Rich");
		System.out.println("Good luck to both of you! Player one please start your turn");
		
	}
	
	public String getStartdDescription()
	{
		return start;
		
	}

	
//	public void setTurnDescription()
//	{
//		
//	}
//	
//	public String getTurndDescription()
//	{
//		return null;
//		
//	}
//	
//	public void setEndDescription()
//	{
//		
//	}
//	
	public void getEndDescription()
	{
		System.out.println("You won the game");
		System.exit(0);
		
	}
	}
//	
//	public String toString()
//	{
//		return null;
//	}
//	
//	
//	int[] boardValue = new int[11];
//
//	{
//	boardValue[1] = +250;
//	boardValue[2] = -100;
//	boardValue[3] = +100;
//	boardValue[4] = -20;
//	boardValue[5] = +180;
//	boardValue[6] = 0;
//	boardValue[7] = -70;
//	boardValue[8] = +60;
//	boardValue[9] = -80;
//	boardValue[10] = -50;
//	boardValue[11] = +650;
//	}
//	String[] boardText = new String[11];
//	{
//		boardText[1] = "Tower";
//		boardText[2] = "Crater";
//		boardText[3] = "Palace gates";
//		boardText[4] = "Cold Desert";
//		boardText[5] =  "Walled city";
//		boardText[6] = "Monastery";
//		boardText[7] = "Black cave";
//		boardText[8] = "Huts in the mountain";
//		boardText[9] = "The Werewall";
//		boardText[10] = "The pit";
//		boardText[11] = "Goldmine";
//	}
//	
//}