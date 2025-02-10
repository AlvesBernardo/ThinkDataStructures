public class Week1
{

	public int factorial(int number){
		if (number <= 2){
			return number;
		}

		return number * factorial(number- 1);

	}

}
