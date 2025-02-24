public class Plane<T> implements Comparable<T>
{
	private String owner;
	private int totalSeat;
	private String Destination;
	private String from;
	private int passengers;
	private int flightNumber;

	public Plane(String owner, int totalSeat, String destination, String from, int passengers, int flightNumber)
	{
		setOwner(owner);
		setTotalSeat(totalSeat);
		setDestination(destination);
		setFrom(from);
		setPassengers(passengers);
		setFlightNumber(flightNumber);
	}

	public String getOwner()
	{
		return this.owner;
	}

	public void setOwner(String owner)
	{
		if (owner == null){
			throw new IllegalArgumentException("Missing owner");
		}
		this.owner = owner;
	}

	public int getTotalSeat()
	{
		return this.totalSeat;
	}

	public void setTotalSeat(int totalSeat)
	{
		this.totalSeat = totalSeat;
	}

	public String getDestination()
	{
		return this.Destination;
	}

	public void setDestination(String destination)
	{
		Destination = destination;
	}

	public String getFrom()
	{
		return this.from;
	}

	public void setFrom(String from)
	{
		this.from = from;
	}

	public int getPassengers()
	{
		return this.passengers;
	}

	public void setPassengers(int passengers)
	{
		if (this.passengers > this.totalSeat){
			throw new IllegalArgumentException("No more sets");
		}
		this.passengers = passengers + this.passengers ;
	}

	public int getFlightNumber()
	{
		return this.flightNumber;
	}

	public void setFlightNumber(int flightNumber)
	{
		this.flightNumber = flightNumber;
	}


	@Override
	public int compareTo(T element)
	{
		return 0;
	}
}
