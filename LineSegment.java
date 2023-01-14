package linecomparision;

import java.util.Scanner;

public class LineSegment {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter points x");
		int x=sc.nextInt();
		System.out.println("Enter points y");
		int y=sc.nextInt();
		
		if(x>0 && y<0)
		{
			System.out.println("points lies in x axis");
		}
		else if(y<0 && x>0)
		{
			System.out.println("Points lies in y axis");
		}else
		{
			System.out.println("points in the line");
		}

	}

}
