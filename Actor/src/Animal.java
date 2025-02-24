public class Animal implements Actor
{
	private String species;
	private String sound;

	public Animal(String species, String sound)
	{
		setSound(sound);
		setSpecies(species);
	}

	public String getSpecies()
	{
		return this.species;
	}

	public void setSpecies(String species)
	{
		this.species = species;
	}

	public String getSound()
	{
		return this.sound;
	}

	public void setSound(String sound)
	{
		this.sound = sound;
	}

	public void eat(){}

	@Override
	public void perform()
	{

	}

	@Override
	public void speak()
	{

	}
}
