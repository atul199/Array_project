import java.util.Scanner;
import java.util.Timer;
public class Test {

	public void largest(int ar[],int num)
	{

		for(int i=0;i<ar.length;i++)
		{
//			System.out.println(ar[i]);
			for(int j=i+1;j<ar.length;j++)
			{
				int temp;
				if(ar[i]<ar[j])
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			
		}
		System.out.println(ar[num-1]);
	}
	public static void main(String[] args) {
	Test t1  = new Test();
	int[] arr = new int[5];
	System.out.println("Enter Array Elements : ");
	
	Scanner var = new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = var.nextInt();
	}
	System.out.println("Find which largest element : ");
	int n = var.nextInt();
	t1.largest(arr,n);
	
	}
}
