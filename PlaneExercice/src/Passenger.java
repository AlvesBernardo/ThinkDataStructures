public class Passenger implements Comparable<Passenger>
{
	private String name;
	private int age;
	private TypeOfSeat typeOfSeat;
	private int numberOfPeople;

	public Passenger(String name, int age, TypeOfSeat typeOfSeat, int numberOfPeople)
	{
		setName(name);
		setAge(age);
		setTypeOfSeat(typeOfSeat);
		setNumberOfPeople(numberOfPeople);
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

	public TypeOfSeat getTypeOfSeat()
	{
		return this.typeOfSeat;
	}

	public void setTypeOfSeat(TypeOfSeat typeOfSeat)
	{
		this.typeOfSeat = typeOfSeat;
	}

	public int getNumberOfPeople()
	{
		return this.numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople)
	{
		this.numberOfPeople = numberOfPeople;
	}

	@Override
	public int compareTo(Passenger other)
	{
		return this.name.compareTo(other.name);
	}
}
