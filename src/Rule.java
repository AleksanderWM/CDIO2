
public class Rule {
	
	Shaker shake = new Shaker();
	


	

	
	
	
	public boolean ruleWolf(Shaker shake)
	{
		if (shake.getShake() == 9)
		{
			return true;
		}
		return false;
	}
		
	public boolean winner(Player player)
	{
	if(player.getBalance() > 1500)
	{
	System.out.println(player.getBalance());
	return true;
	}
	return false;

	
	}
		
	
	
}

	
	


