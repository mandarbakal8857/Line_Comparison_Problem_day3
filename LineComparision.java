package linecomparision;

import java.util.Objects;

public class LineComparision {

	public static void main(String[] args) 
	{
		double firstLength=lineLengthCalculator(-3,5,-1,-6);
		double SecondLength=lineLengthCalculator(5,7,5,8);
		
		 if(Objects.equals(firstLength,SecondLength))
		 {
			 System.out.println("Line r equal");
			 System.out.println("first length"+firstLength+"secondLength"+SecondLength);
			 
		 }else
		 {
			 System.out.println("Not equal");
			 System.out.println("first length"+firstLength+"second length"+SecondLength);
		 }

	}
	public static double lineLengthCalculator(int x1,int x2,int y1,int y2)
	{
		double x=Math.pow(x2-x1, 2);
		double y=Math.pow(y2-y2, 2);
		
		return Math.sqrt(x+y);
		
	}

}
