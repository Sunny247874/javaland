package hello;

public class ayush {
public static void main(String[]args) {
	int ar[]={85,20,40,37,75,98,34,32,74,};
	int max[]=ar[0];
	int min[]=ar[0];
	int n=5;
	for( int i=0;i<n;i++)
	{
		//finding maximum value
		if(max<ar[i])
			max=ar[i];
		//finding minimum value
		if(mn>ar[i])
			min=ar[i];
	}
	System.out.println("max value="+max);
	System.out.println("min value="+min);
	System.out.println("defference="+(max-min));
}
}
