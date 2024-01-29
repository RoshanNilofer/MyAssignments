package week2.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int n=8, firstnum=0,secondnum=1;
		for(int i=1; i<=n; i++) {
		System.out.println(firstnum + " ");
		int nextnum = firstnum + secondnum;
		firstnum = secondnum;
		secondnum = nextnum;

	}
	}

}
