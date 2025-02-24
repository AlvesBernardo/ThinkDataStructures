import java.util.ArrayList;
import java.util.List;

public class Plane {
	public static void main(String[] args) {
		List<Passenger> passengers = new ArrayList<>();
		passengers.add(new Passenger("Alice", 30, TypeOfSeat.Business, 1));
		passengers.add(new Passenger("Bob", 25, TypeOfSeat.Economy, 2));
		passengers.add(new Passenger("Charlie", 35, TypeOfSeat.Premium, 1));

		List<Plane> planes = new ArrayList<>();
		Plane p1 = new Plane("AirlineA", 150, "Paris", "New York", "AA123");
		Plane p2 = new Plane("AirlineB", 200, "London", "Tokyo", "BB456");
		planes.add(p1);
		planes.add(p2);

		p1.addPassenger(passengers.get(0));
		p2.addPassenger(passengers.get(1));

		System.out.println("\nPassengers sorted by name (default):");
		Collections.sort(passengers);
		passengers.forEach(System.out::println);

		System.out.println("\nPassengers sorted by age & number of people:");
		passengers.sort(new PassengerComparator());
		passengers.forEach(System.out::println);

		System.out.println("\nPlanes sorted by flight number (default):");
		Collections.sort(planes);
		planes.forEach(System.out::println);

		System.out.println("\nPlanes sorted by total seats & destination:");
		planes.sort(new PlaneComparator());
		planes.forEach(System.out::println);

		Passenger targetPassenger = passengers.get(0);
		Plane targetPlane = p1;
		System.out.println("\nChecking if " + targetPassenger.getName() + " is on flight " + targetPlane.getFlightNumber() + ": " + targetPlane.getPassengers().contains(targetPassenger));
	}
}