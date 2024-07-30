package arrays;

import java.util.Scanner;

public class ToFindHighestSumInArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array : ");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elements in array : ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int sum=0;
	System.out.println("Print highest sum.....");
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(sum<a[i]+a[j]) {
				sum=a[i]+a[j];
			}
		}
	}
	System.out.println(sum);
}
}
