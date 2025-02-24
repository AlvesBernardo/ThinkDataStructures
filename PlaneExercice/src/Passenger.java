public class Passenger
{
	private String name;
	private int age;
	private TypeOfSeat typeOfSeat;
	private Ticket ticket;
	private int number;

	public Passenger(String name, int age, TypeOfSeat typeOfSeat, Ticket ticket, int number)
	{
		setName(name);
		setAge(age);
		setTypeOfSeat(typeOfSeat);
		setTicket(ticket);
		setNumber(number);
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

	public Ticket getTicket()
	{
		return this.ticket;
	}

	public void setTicket(Ticket ticket)
	{
		this.ticket = ticket;
	}

	public int getNumber()
	{
		return this.number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}
}
