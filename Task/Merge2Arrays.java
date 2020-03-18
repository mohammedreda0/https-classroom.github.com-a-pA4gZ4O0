package Task;
import java.util.Arrays;
import java.util.Scanner;
public class Merge2Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of elements on array 1");
		int i = sc.nextInt();
		System.out.println("number of elements on array 2");
		int y = sc.nextInt();

		int []a= new int[i];
		int []b= new int[y];
		int [] result=new int[a.length+b.length];
		System.out.println("write the elements of array 1");
		for(int x = 0;x<a.length;x++) {
			int num1 = sc.nextInt();
			a[x] =num1;
		}
		
		System.out.println("write the elements of array 2");
		for(int z = 0;z<b.length;z++) {
			int num2 = sc.nextInt();
			b[z] =num2;
		}
		System.out.println("the elments of array 1 "+Arrays.toString(a));
		System.out.println("the elments of array 2 "+Arrays.toString(b));
		
		
		int rindex=0;
		for(int aindex=0;aindex<a.length;aindex++)
		{
			result[rindex]=a[aindex];
			rindex++;
		}
		for(int bindex=0;bindex<b.length;bindex++)
		{
			result[rindex]=b[bindex];
			rindex++;
		}
	Arrays.sort(result);
System.out.println("merge of 2 arrays is "+Arrays.toString(result));
}
}