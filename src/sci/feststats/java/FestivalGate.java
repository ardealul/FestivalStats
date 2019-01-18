package sci.feststats.java;

public enum FestivalGate { ONE, TWO, TREE, FOUR, FIVE;
	public static FestivalGate getRandom()    
	{
	  return values()[(int)(Math.random() * values().length)];
	}
}
