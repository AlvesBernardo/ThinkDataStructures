public class Week1
{

	public int factorial(int number){
		if (number == 1 || number == 0){
			return 1;
		}

		return number * factorial(number- 1);

	}


	public static void main(String[] args){
		Week1 week1 = new Week1();
		System.out.println("Factorial of 7: " + week1.factorial(7));
	}

}
