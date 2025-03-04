public class MainWeapon
{
	public static void main(String[] args) {
		// Anonymous class implementing Weapon interface
		Weapon gun = new Weapon() {
			@Override
			public void shoot() {
				System.out.println("Bang! The weapon has been fired.");
			}
		};

		// Anonymous class extending Person abstract class
		Person soldier = new Person() {
			@Override
			void stats() {
				System.out.println("This is a strong soldier with high endurance.");
			}
		};

		// Calling the methods
		gun.shoot();
		soldier.stats();
	}
}

