package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("number of elements on array 1");
		int i = sc.nextInt();
		

		int []a= new int[i];
		
		System.out.println("write the elements of array 1");
		for(int x = 0;x<a.length;x++) {
			int num1 = sc.nextInt();
			a[x] =num1;
		}
		System.out.println("the elments of array 1 "+Arrays.toString(a));
		System.out.println("Enter the target");
		int T=sc.nextInt();
		for(int y=0;y<a.length;y++) {
			for(int j=1;j<a.length;j++) {
				if(y!=j&&y<j) {
					if(a[y]+a[j] == T) {
						System.out.println("the indices is " +"[ "+ y + ", "+j+ " ]");
						
						flag = false;
					} 
				}
			}
		}
		if (flag ==true) {
			System.out.println("no indices found!");
		}
	}

}
