import java.util.HashMap;

public class Ticket<T> implements Comparable<T>
{
	private HashMap<Plane, Passenger> tickets;


	public Ticket()
	{
		this.tickets = new HashMap<>();
	}

	public HashMap<Plane, Passenger> getTickets()
	{
		return this.tickets;
	}

	public void setTickets(HashMap<Plane, Passenger> tickets)
	{
		this.tickets = tickets;
	}

	public void addTicket(Plane plane, Passenger passenger){
		this.tickets.put(plane, passenger);
	}

	@Override
	public int compareTo(T o)
	{
		return 0;
	}
}
