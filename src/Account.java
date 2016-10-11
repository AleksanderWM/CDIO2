
public class Account {
	
	private int balance = 1000;
	private int MIN = 0;
	
	public Account()
	{
		
	}
	
	public void setBalance(int point)
	{
		balance = balance + point;
		if(balance < 0)
		{
			balance = 0;
		}
	}
	
	public int getBalance()
	{
		return balance;
	}
}
