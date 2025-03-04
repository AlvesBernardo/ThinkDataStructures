public class PassangerComparator
{

	static class PassagengerComp implements Comparable<Passenger>
	{
		@Override
		public int compareTo(Passenger p1, Passenger p2)
		{
			int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
			return (ageComparison != 0) ? ageComparison : Integer.compare(p1.getNumberOfPeople(), p2.getNumberOfPeople());
		}
	}
}
