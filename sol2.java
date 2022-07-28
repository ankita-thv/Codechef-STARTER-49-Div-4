/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int arr[]= new int[2];
		    int arr2[]= new int[2];
		    for(int i=0;i<2;i++){
		        arr[i]=sc.nextInt();
		    }Arrays.sort(arr);
		 int max1= arr[1];
		    for(int i=0;i<2;i++){
		        arr2[i]=sc.nextInt();
		    }Arrays.sort(arr2);
		    int max2=arr2[1];
		    int max=max1+max2;
		    System.out.println(max);
		}
	}
}
