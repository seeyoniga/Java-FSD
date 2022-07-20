import java.util.*;

public class orderstatistics {
	public static void main(String[] args) {
		int a[]= {35,12,9,21,3,54};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth smallest element u wish to get [the array size is 6]");
		int n = sc.nextInt();
		Arrays.sort(a);
		System.out.println("the"+n+"th smallest element is :"+a[n-1]);
	}
}
