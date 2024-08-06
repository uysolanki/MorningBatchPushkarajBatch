package day5functions;

public class CBRDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		test(arr[0]);//actual para
		System.out.println(arr[0]);

	}

	private static void test(int x) {
		x=99;	
	}

}
