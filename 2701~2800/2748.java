import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		scan.close();
		System.out.println(fib(in));
		
	}
	
	public static long fib(int in) {
		long[] fib = {0,1,0};
		for(int i = 0; i < in; i++) {
			fib[0] = fib[1];
			fib[1] = fib[2];
			fib[2] = fib[0]+fib[1];
		}
		return fib[2];
	}
}