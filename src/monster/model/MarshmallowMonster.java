package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int noseCount;
	private int armCount;

	public MarshmallowMonster()
	{
		this.name = "no name here";
		this.antennaCount = 0;
		this.eyeCount = 0;
		this.hasBellyButton = false;
		this.noseCount = 0;
		this.armCount = 0;
	}

	public MarshmallowMonster(String name, double antennaCount, int eyeCount, boolean hasBellyButton, int noseCount, int armCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.noseCount = noseCount;
		this.armCount = armCount;
		/*
		 * name = Zambumafu The destroyer4 antenna 2 .5 and 2 .252 eyes
		 * hasBellyButton = false;nose count 1armcount = 2
		 */
	}

	public String getName()
	{
		return name;
	}

	public double getAntennaCount()
	{
		return antennaCount;
	}

	public int getEyeCount()
	{
		return eyeCount;
	}

	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}

	public int getNoseCount()
	{
		return noseCount;
	}

	public int getArmCount()
	{
		return armCount;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAntennaCount(double antennaCount)
	{
		this.antennaCount = antennaCount;
	}

	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}

	public boolean setHasBellyButton()
	{
		return hasBellyButton;
	}

	public void setNoseCount(int noseCount)
	{
		this.noseCount = noseCount;
	}

	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}

	public String toString()
	{
		String bellyButton;
		if (hasBellyButton)
		{
			bellyButton = "has a belly button, ";
		} else
		{
			bellyButton = "does not have a belly button, ";
		}
		return (name + " has " + antennaCount + " antennas , " + eyeCount + " eyes , " + bellyButton + armCount + " arms and " + noseCount + " noses");

	}
}