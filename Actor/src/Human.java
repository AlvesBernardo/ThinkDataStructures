public class Human implements Actor
{
	private String name;
	private int age;
	private String proffesion;


	public Human(String name, int age, String proffesion)
	{
		setAge(age);
		setName(name);
		setProffesion(proffesion);
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getProffesion()
	{
		return this.proffesion;
	}

	public void setProffesion(String proffesion)
	{
		this.proffesion = proffesion;
	}

	@Override
	public void perform()
	{

	}

	@Override
	public void speak()
	{

	}
}
