class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String sound, String name)
	{
		myName = name;
		mySound = sound;
		myType = type;
	}
    public NamedCow()
    {
    	myName = "unknown"; 
    }
	public String getName()
	{
		return myName;
	}
}