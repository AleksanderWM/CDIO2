public class Die {
	
	//Creation of attributes
	private final int MAX = 6;
	private int faceValue;
	
	/**
	 * Creates the constructor, Die.
	 */
	public Die()
	{
		faceValue = 1;
	}
	
	/**
	 * This method rolls the die for us.
	 */
	public void setRoll() 
	{
		faceValue = (int) ((Math.random() * MAX) + 1);
	}
	
	/**
	 * This returns the die's value.
	 * @return
	 */
	public int getRoll()
	{
		return faceValue;
	}
}