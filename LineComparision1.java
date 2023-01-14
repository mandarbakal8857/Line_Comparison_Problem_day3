package linecomparision;

import java.util.Objects;

public class LineComparision1 {

	public static void main(String[] args)
	{
		double firstLength=lineLengthCalculator(-3,5,-1,-6);
		double SecondLength=lineLengthCalculator(5,7,5,8);
		String line1=String.valueOf(firstLength);
		String line2=String.valueOf(SecondLength);
		
		int result=line1.compareTo(line2);
		
		 if(Objects.equals(firstLength,SecondLength))
		 {
			 System.out.println("Line r equal");
			 System.out.println("first length"+firstLength+"secondLength"+SecondLength);
			 
		 }else
		 {
			 System.out.println("Not equal");
			 System.out.println("first length"+firstLength+"second length"+SecondLength);
		 }

	
	if(result==0)
	{
		System.out.println("Both r equal");
	}else if(result>0)
	{
		System.out.println("the  line 1 is greater than 2");
	}
	else
	{
		System.out.println("The line 2 greater than 1");
	}
	
	}
	public static double lineLengthCalculator(int x1,int x2,int y1,int y2)
	{
		double x=Math.pow(x2-x1, 2);
		double y=Math.pow(y2-y2, 2);
		
		return Math.sqrt(x+y);
		
	}



}
