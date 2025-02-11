public class Fibonacci
{
	static int nthFibonacci(int n){
		if(n <= 1){
			return n;
		}

		return nthFibonacci(n-1) + nthFibonacci(n - 2);
	}


	static int nthFibonacci2(int n){
		if (n <= 1) return n;

		int curr = 0;

		int prev1 = 1;
		int prev2 = 0;

		for (int i = 2; i <= n; i++){
			curr = prev1 + prev2;
        	prev2 = prev1;
        	prev1 = curr;
		}

		return curr;

	}

	public static void main(String[] args){
		int n = 5;
		int result = nthFibonacci(n);
		int result2 = nthFibonacci2(n);
		System.out.println(result);
		System.out.println(result2);
	}

	//this solution is O(n2)
	//O(n)


}