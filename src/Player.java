
public class Player {
	
	private String nameOfPlayer;
	private int balance;
	Account playerBalance = new Account();
	
	public Player(String name, int point)
	{
		nameOfPlayer = name;
		balance = point;
	}
	
	public void setPlayerName(String name)
	{
		nameOfPlayer = name;
	}
	
	public String getPlayerName()
	{
		return nameOfPlayer;
	}

	public void setBalance(int point)
	{
		playerBalance.setBalance(point);
		balance = playerBalance.getBalance();
	}
	
	public int getBalance()
	{
		return playerBalance.getBalance();
	}
	
	public String toString()
	{
		return null;
		
	}
}
